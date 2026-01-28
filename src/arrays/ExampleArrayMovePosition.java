package arrays;

import java.util.Scanner;

public class ExampleArrayMovePosition {
    public static void main(String[] args) {
        int[] a = new int[10];
        int last;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Please enter a number integer: ");
            a[i] = sc.nextInt();
        }

        last = a[a.length-1];
        for (int i = a.length-2; i>=0; i--) {
            a[i+1] = a[i];
        }
        a[0] = last;

        System.out.println("The array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
