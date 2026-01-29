package arrays;
import java.util.Scanner;

public class ExampleArrayMovePosition2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int element, position, last;
        Scanner sc = new Scanner(System.in);

        // Insert element in the array
        for (int i = 0; i < a.length; i++){
            System.out.print("Please enter a number integer: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\nPlease enter the new element to insert: ");
        element = sc.nextInt();

        System.out.print("\nPlease enter the position where to add the element: ");
        position = sc.nextInt();

        last = a[a.length - 1];
        for(int i = a.length - 2; i >= position; i --){
            a[i+1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[position] = element;
        b[b.length - 1] = last;

        System.out.println("Array");
        for (int i = 0; i < b.length; i++) {
            System.out.println(i + " -> " + b[i]);
        }
    }
}