package arrays;
import java.util.Arrays;

public class ExampleArray {
    public static void main(String[] args) {
        String[] products = new String[7]; // Array of 7 position type String

        products[0] = "sebas";
        products[1] = "andres";
        products[2] = "johan";
        products[3] = "moreno";
        products[4] = "jorge";
        products[5] = "camilo";
        products[6] = "phil";

        // Arrange the items alphabetically
        Arrays.sort(products);

        String product1 = products[0];
        String product2 = products[1];
        String product3 = products[2];
        String product4 = products[3];
        String product5 = products[4];
        String product6 = products[5];
        String product7 = products[6];

        System.out.println("product1 = " + product1);
        System.out.println("product2 = " + product2);
        System.out.println("product3 = " + product3);
        System.out.println("product4 = " + product4);
        System.out.println("product5 = " + product5);
        System.out.println("product6 = " + product6);
        System.out.println("product7 = " + product7);


        int[] numbers = new int[4]; // Array of 4 position

        // Accesses each position and assigns it a value
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
