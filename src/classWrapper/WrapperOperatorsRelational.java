package classWrapper;

public class WrapperOperatorsRelational {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("They are the same object: "+(num1==num2));

        num2 = 1000;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Checks if they are the same object
        System.out.println("They are the same object: "+(num1==num2));
        // Compare the value
        System.out.println("They have the same value: "+(num1.equals(num2)));
    }
}
