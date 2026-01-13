package operators.practice;
import java.util.Scanner;
public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        int solicitedNumber = sc.nextInt();

        String positiveOrNegative = (solicitedNumber > 0)
                ? "Positive" : "Negative";
        String evenOrOdd = (solicitedNumber % 2 == 0)
                ? "Even" : "Odd";

        System.out.println("The number "+solicitedNumber+" is "+positiveOrNegative+" and "+evenOrOdd);

        sc.close();
    }
}
