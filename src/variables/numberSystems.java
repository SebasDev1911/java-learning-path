package variables;

import javax.swing.*;

public class numberSystems {
    public static void main(String[] args) {

        String strNumber = JOptionPane.showInputDialog(null, "Enter a integer number: ");
        int decimalNumber = 0;
        try{
            decimalNumber = Integer.parseInt(strNumber);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: You must enter a integer number");
            main(args);
            System.exit(decimalNumber);
        }

        System.out.println("decimalNumber = " + decimalNumber);
        System.out.println("Binary number of = " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber));

        int binaryNumber = 0b111110100; // With the 0b extension, the Java compiler assume that the data is binary
        System.out.println("Binary number to decimal number = " + binaryNumber);

        System.out.println("Octal number of "+decimalNumber+" = "+Integer.toOctalString(decimalNumber));

        String message = "Binary number of = " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        JOptionPane.showMessageDialog(null, message);

    }
}
