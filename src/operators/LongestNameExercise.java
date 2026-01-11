package operators;

import javax.swing.*;

public class LongestNameExercise {
    public static void main(String[] args) {
        String nameOne = JOptionPane.showInputDialog("Please, enter the name of person number one");

        String nameTwo = JOptionPane.showInputDialog("Please, enter the name of person number two");

        String nameThree = JOptionPane.showInputDialog("Please, enter the name of person number three");

        String storeNameOne = nameOne.split(" ")[0];
        String storeNameTwo = nameTwo.split(" ")[0];
        String storeNameThree = nameThree.split(" ")[0];

        String longestName = (storeNameOne.length() > storeNameTwo.length())
                ? storeNameOne : storeNameTwo;

        longestName = (longestName.length() > storeNameThree.length())         ? longestName : storeNameThree;

        System.out.println(longestName + " has the longest name");
    }
}
