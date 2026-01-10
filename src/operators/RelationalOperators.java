package operators;

public class RelationalOperators {
    public static void main(String[] args) {
        // Relational operators are used to make comparison between two things
        
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        
        boolean booleanOne = i == j; // 3 = 7 => false
        System.out.println("booleanOne = " + booleanOne);

        boolean booleanTwo = !booleanOne; // Negation signed, converted true to false
        System.out.println("booleanTwo = " + booleanTwo); // true => false

        boolean booleanThree = i != j; // Different operator, 3 different 7 => true
        System.out.println("booleanThree = " + booleanThree);
        
        boolean booleanFour = m == true;
        System.out.println("booleanFour = " + booleanFour);

        boolean booleanFive = i > j;
        System.out.println("booleanFive = " + booleanFive);

        boolean booleanSix = i < j;
        System.out.println("booleanSix = " + booleanSix);

        boolean booleanSeven = i >= j;
        System.out.println("booleanSeven = " + booleanSeven);

        boolean booleanEight = l <= k;
        System.out.println("booleanEight = " + booleanEight);
    }
}
