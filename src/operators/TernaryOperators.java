package operators;
import java.util.Scanner;
public class TernaryOperators {
    public static void main(String[] args) {
        /* Ternary operators have three phases: the first is the condition under which the variable will be evaluated; the second is a value that will be assigned to the variable as long as the validation is true; and the last condition is the value that the variable will take if its condition is false */
        String variableTernary = 7==7 ? "Is true" : "Is false";
        System.out.println("variableTernary = " + variableTernary);

        String status = "";
        double averageExample = 6.2;

        status = averageExample >= 5.49 ? "Approved" : "Refused";
        System.out.println("status = " + status);

        /* EXAMPLE USING SCANNER, AVERAGE NOTES */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your math grade: ");
        double math = sc.nextDouble();
        System.out.println("Please enter your sciences grade: ");
        double sciences = sc.nextDouble();
        System.out.println("Please enter your history grade: ");
        double history = sc.nextDouble();

        double averageNotes = (math + sciences + history) / 3;
        String statusNotes = averageNotes >= 5.49 ? "Approved" : "Refused";
    }
}
