package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        String[] products = new String[7]; // Array of 7 position type String

        System.out.println("---- First Interaction ----");
        int lengthArrayProducts = products.length;
        for (int i=0; i<lengthArrayProducts; i++){
            System.out.println("For index "+i+": "+products[i]);
        }

        products[0] = "sebas";
        products[1] = "andres";
        products[2] = "johan";
        products[3] = "moreno";
        products[4] = "jorge";
        products[5] = "camilo";
        products[6] = "phil";

        System.out.println("\n---- Second Interaction Using For ----");
        Arrays.sort(products); // It is ordered alphabetically
        for (int i=0; i<lengthArrayProducts; i++){
            System.out.println("For index "+i+": "+products[i]);
        }

        int count = 0;
        for (int i=0; i<lengthArrayProducts; i++){
            for(int j=0; j < lengthArrayProducts; j++){
                if(products[i].compareTo(products[j]) < 0){
                    String assistant = products[i];
                    products[i] = products[j];
                    products[j] = assistant;
                }
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
