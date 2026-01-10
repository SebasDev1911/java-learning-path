package operators;

public class LogicOperators {
    public static void main(String[] args) {
        /* Logical operators allow you to evaluate more than one condition; with the AND operator, all conditions must be true, and with OR, if one is true, the entire condition will also be true */
        int i = 3;
        byte j = 3;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        // OPERATOR AND && 
        boolean booleanOne = i == j && k > l; // Second expression is false, all expression is false
        System.out.println("booleanOne = " + booleanOne);
        
        boolean booleanTwo = i == j || k > l; // First expression is true. all expression is true
        System.out.println("booleanTwo = " + booleanTwo);
        
        boolean booleanThree = i == j && k > l || m == false;
        System.out.println("booleanThree = " + booleanThree);
    }
}
