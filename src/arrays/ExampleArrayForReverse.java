package arrays;

import java.util.Arrays;

public class ExampleArrayForReverse {
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

        // Iteration reverse
        System.out.println("\n---- Third Interaction Using For Reverse ----");
        for (int i=0; i<lengthArrayProducts; i++){
            System.out.println("For i = "+i+" value: "+products[lengthArrayProducts-1-i]);
        }

        System.out.println("\n---- Quart Interaction Using For Reverse 2 ----");
        for(int i=lengthArrayProducts-1; i>=0; i--){
            System.out.println("For i = "+i+" value: "+products[i]);
        }
    }
}
