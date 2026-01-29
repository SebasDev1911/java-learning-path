package arrays.practice;
import java.util.Scanner;

public class ArrayAverageNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrays = new int[7];

        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter number: ");
            arrays[i] = sc.nextInt();
        }

        int countPositive = 0, countNegative = 0, countZero = 0;
        double sumPositive = 0, sumNegative = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > 0) {
                countPositive++;
                sumPositive += arrays[i];
            } else if (arrays[i] < 0) {
                countNegative++;
                sumNegative += arrays[i];
            } else {
                countZero++;
            }
        }

        if (countPositive > 0) {
            System.out.println("Average of positive numbers = " + (sumPositive / countPositive));
        } else {
            System.out.println("No positive numbers entered.");
        }

        if (countNegative > 0) {
            System.out.println("Average of negative numbers = " + (sumNegative / countNegative));
        } else {
            System.out.println("No negative numbers entered.");
        }

        System.out.println("Zero count = " + countZero);

        sc.close();
    }
}
