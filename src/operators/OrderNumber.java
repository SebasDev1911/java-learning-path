package operators;
import java.util.Scanner;
public class OrderNumber {
    public static void main(String[] args) {
        // Scanner object to receive screen input
        Scanner sc = new Scanner(System.in);

        // Input of data
        System.out.println("Please enter a number: ");
        int numberOne = sc.nextInt();
        System.out.println("Please enter a number: ");
        int numberTwo = sc.nextInt();

        // Validation using ternary operator and organize numbers from largest to smallest
        String greaterNumber = (numberOne > numberTwo)
                ? numberOne + " - " + numberTwo
                : numberTwo + " - " + numberOne;

        // Print order of numbers
        System.out.println("greaterNumber = " + greaterNumber);
        sc.close();
    }
}
