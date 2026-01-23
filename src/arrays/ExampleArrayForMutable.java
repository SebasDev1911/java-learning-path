package arrays;

import java.util.Arrays;

public class ExampleArrayForMutable {
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

        // Change the position of elements by accessing the first and last positions
        for (int i=0; i<lengthArrayProducts/2; i++){
            String actualElement = products[i];
            String inversoElement = products[lengthArrayProducts-1-i];

            products[i] = inversoElement;
            products[lengthArrayProducts-1-i] = actualElement;
        }

        System.out.println("\n---- Fifth Interaction Elements Reverse----");
        for (int i=0; i<lengthArrayProducts; i++){
            System.out.println("For index "+i+": "+products[i]);
        }
    }
}
