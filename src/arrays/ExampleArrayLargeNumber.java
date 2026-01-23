package arrays;
import java.util.Scanner;

public class ExampleArrayLargeNumber {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in); // Instance object Scanner

        // Request data from the console and add it to the 5-position array
        System.out.println("Please enter 5 number integer: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        // Iterate eath array element for search the large number
        int max = 0;
        for(int i = 1; i < a.length; i++){
            max = (a[max] > a[i])? max : i;
        }

        System.out.println("max = " + a[max]);
    }
}
