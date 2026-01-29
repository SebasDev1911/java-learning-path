package arrays.practice;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number: ");
            array[i] = sc.nextInt();
        }

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nMin value: " + min);
        System.out.println("Max value: " + max);

        sc.close();
    }
}
