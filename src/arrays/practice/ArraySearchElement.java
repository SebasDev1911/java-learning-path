package arrays.practice;
import java.util.Scanner;

public class ArraySearchElement {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        int elementSearch;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Please enter a number integer: ");
            arrays[i] = sc.nextInt();
        }

        System.out.print("\nPlease enter the number to search: ");
        elementSearch = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] == elementSearch){
                System.out.println("Found element in the position " + i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Element not found");
        }
        sc.close();
    }
}
