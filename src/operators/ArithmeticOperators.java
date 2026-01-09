package operators;
import javax.swing.*;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Way to declare variables in a single line
        int i = 5, j = 4, add = i + j;

        // Arithmetic operator add
        System.out.println("add = " + add);
        System.out.println("i + j = " + (i + j));

        // Arithmetic operator substraction
        int substraction = i-j;
        System.out.println("substraction = " + substraction);
        System.out.println("i - j = " + (i - j)); // If the parentheses are not placed, it will take a concatenation and give an error

        // Arithmetic operator multiplication
        int multi = i * j;
        System.out.println("multi = " + multi);

        // Arithmetic operator division
        int division = i / j;
        float division2 = (float)i / (float)j;
        System.out.println("division = " + division);
        System.out.println("division2 = " + division2);

        // Arithmetic operator module
        int module = i % j;
        System.out.println("module = " + module);

        // Example using module arithmetic operator
        int number = Integer.parseInt(JOptionPane.showInputDialog("Please, enter a number"));
        if(number % 2 == 0){
            System.out.println("The number "+number+" is pair");
        }else{
            System.out.println("The number "+number+" is odd");
        }
    }
}
