package controlFlow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class sentenceSwitchCase {
    public static void main(String[] args) {
        /* The `switch` conditional statements accept data types such as `int`, `char`, `byte`, etc., as parameters. They function to validate that the value passed as a parameter matches the specified conditions, thus triggering the execution of the corresponding block of code.
         */
        int num = 3;

        switch (num) {
            case 0:
                System.out.println("The number is cero");
                // If the break statement is not written, the code continues to execute.
                break;
            case 1:
                System.out.println("The number is one");
                break;
            case 2:
                System.out.println("The number is two");
                break;
            case 3:
                System.out.println("The number is three");
                break;
            default:
                System.out.println("Unknown character");
        }

        String name = "Sebastian";
        switch (name){
            case "admin":
                System.out.println("Hello admin, welcome");
                break;
            case "Sebastian":
                System.out.println("Hello sebastian, welcome");
                break;
            case "pepe":
                System.out.println("Hello pepe, welcome");
                break;
            default:
                System.out.println("Unknown user");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of month: ");
        int numberMonth = sc.nextInt();

        switch(numberMonth){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("Number incorrect");
        }
    }
}
