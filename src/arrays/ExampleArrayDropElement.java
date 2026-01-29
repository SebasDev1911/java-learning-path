package arrays;
import java.util.Scanner;

public class ExampleArrayDropElement {
    public static void main(String[] args) {
        int[] a = new int[10]; // Create array
        int position = 0; // Variable drop position

        Scanner sc = new Scanner(System.in); // Instance object the Scanner class

        // Add elements to the array
        for (int i = 0; i < a.length; i++){
            System.out.print("Please enter a number integer: "); // Request number
            a[i] = sc.nextInt(); // Insert element in the position i
        }

        // Request number position
        System.out.print("\nPlease enter the delete position between (0 - 9): ");
        position = sc.nextInt();

        // Access the requested position and insert the element following that position
        for (int i = position; i < a.length - 1; i++){
            a[i] = a[i+1];
        }

        // Copy the original array to a new array by removing the last position
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);

        // Show copy of the first array
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " -> " + b[i]);
        }
    }
}
