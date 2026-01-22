package classMath;
public class ExampleClassMath {
    public static void main(String[] args) {
        // Method for finding the absolute value of a number
        int absolute = Math.abs(-3);
        System.out.println("absolute = " + absolute);
        absolute = Math.abs(3);
        System.out.println("absolute = " + absolute);

        // Method for finding the greater or lesser of any two numbers
        double max = Math.max(3.5, 5);
        System.out.println("max = " + max);
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Round a number up
        double ceiling = Math.ceil(3.5);
        System.out.println("ceiling = " + ceiling);

        // Round a number down
        double floor = Math.floor(3.5);
        System.out.println("floor = " + floor);

        // Round a float or double number to the nearest integer
        long integer = Math.round(3.5);
        System.out.println("integer = " + integer);
        long integerPI = Math.round(Math.PI);
        System.out.println("integerPI = " + integerPI);

        // Exponential method
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // Natural logarithm
        double log = Math.log(10);
        System.out.println("log = " + log);

        // Method for calculate a power of number
        double power = Math.pow(10, 3);
        System.out.println("power = " + power);

        double root = Math.sqrt(4);
        System.out.println("root = " + root);

        // TRIGONOMETRY
        // Method to convert from radians to degrees
        double degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("Convert of radians to degrees  = " + degrees);

        // Method to convert from degrees to radians
        double radians = Math.toRadians(90.00);
        System.out.println("Convert of degrees to radians  = " + radians);

        System.out.println("sin(90): "+Math.sin(radians));
        System.out.println("cos(90): "+Math.cos(radians));
    }
}
