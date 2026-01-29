package arrays.practice;
import java.util.Scanner;

public class ArrayInsertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        int element, position = 0;

        // Fill array
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number: ");
            array[i] = sc.nextInt();
        }

        System.out.print("\nEnter new element: ");
        element = sc.nextInt();

        // Find insert position
        while (position < array.length && element > array[position]) {
            position++;
        }

        // Create new array
        int[] newArray = new int[array.length + 1];

        // Copy left side
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert element
        newArray[position] = element;

        // Move right side
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.println("\nResult array:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(i + " -> " + newArray[i]);
        }

        sc.close();
    }
}
