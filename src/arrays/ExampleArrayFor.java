package arrays;

import java.util.Arrays;

public class ExampleArrayFor {
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

        System.out.println("\n---- Third Interaction Using ForEach ----");
        int count = 0;
        for (String product:products){
            System.out.println("For index "+count+": "+product);
            count++;
        }

        System.out.println("\n---- Quarter Interaction Using While ----");
        int i = 0;
        while(i < lengthArrayProducts){
            System.out.println("For index "+i+": "+products[i]);
            i++;
        }

        System.out.println("\n---- Fifth Interaction Using DoWhile ----");
        int j = 0;
        do{
            System.out.println("For index "+j+": "+products[j]);
            j++;
        }while(j < lengthArrayProducts);
        
        // ----------------------------------------- //
        int[] numbers = new int[10];
        int lengthArrayNumber = numbers.length;
        for(int k=0; k<lengthArrayNumber; k++){
            numbers[k] = k*3;
        }
        
        for(int k=0; k<lengthArrayNumber; k++){
            System.out.println("numbers[k] = " + numbers[k]);
        }
    }
}
