package operators;
import java.util.Scanner;

public class TernaryOperatorsGreaterNumber {
    public static void main(String[] args) {
        int greater = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Please enter a number: ");
        int num2 = sc.nextInt();

        System.out.println("Please enter a number: ");
        int num3 = sc.nextInt();

        greater = (num1 > num2) ? num1 : num2;
        greater = (greater > num3) ? greater : num3;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("greater = " + greater);
    }
}
