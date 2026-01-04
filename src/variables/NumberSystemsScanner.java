package variables;
import java.util.InputMismatchException;
import java.util.Scanner; // Import class Scanner

public class NumberSystemsScanner {
    public static void main(String[] args) {

        /* EXAMPLE WITH EXCEPTION TYPE 'NumberFormatException'*/

        // Instance of class Scanner, to receive input data with parameter 'System.in'
        Scanner sc = new Scanner(System.in);
        // Request the number via console
        System.out.print("Please, enter a integer number: ");
        String userEntered = sc.nextLine(); // Capture the data entered by the user
        try{
            // Converts the String data type in Int data type using the 'parseInt' class method
            int numberEntered = Integer.parseInt(userEntered);
            System.out.println("The number entered is: "+numberEntered);
        }catch(NumberFormatException e){ // The exception by method 'next.line'
            System.out.println("The number entered is incorrect");
            main(args);
            System.exit(0);
        }

        /* EXAMPLE WITH EXCEPTION TYPE 'InputMismatchException'*/
        System.out.print("Please, enter a number integer: ");
        try {
            int userEntered2 = sc.nextInt();
            System.out.println("The number is: " + userEntered2);
        } catch (InputMismatchException e) {
            System.out.println("Error: number entered is incorrect");
            main(args);
            System.exit(0);
        }
    }
}
