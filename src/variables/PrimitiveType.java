package variables;

public class PrimitiveType {
    public static void main(String[] args) {
        // Boolean Type -> Can true or false
        boolean valueTrue = true;
        boolean valueFalse = false;

        // Char Type -> Supports a single value
        char valueOne = 'a';
        char valueTwo = '1';

        // Integer Primitive
        byte integerByte = 127;
        short integerShort = 32767;
        int integerInt = 2147483647;
        long integerLong = 9223372036854775807L;

        // Real numbers -> Store numbers in decimal format
        float realFloat = 3.1416f;
        double realDouble = 4.7029235E3;

        // Example integer primitive type -> Important
        byte numberByte = 7;
        System.out.println("Number Byte: " + numberByte);
        System.out.println("Corresponding byte type in byte to: " + Byte.BYTES);
        System.out.println("Corresponding byte type in bites to: " + Byte.SIZE);
        System.out.println("Max value of byte: " + Byte.MAX_VALUE); // 127
        System.out.println("Min value of byte: " + Byte.MIN_VALUE); // -128

        short numberShort = 30000;
        System.out.println("Number Short: " + numberShort);
        System.out.println("Corresponding short type in byte to: " + Short.BYTES);
        System.out.println("Corresponding short type in bites to: " + Short.SIZE);
        System.out.println("Max value of short: " + Short.MAX_VALUE); // 32767
        System.out.println("Min value of short: " + Short.MIN_VALUE); // -32768

        int numberInt = 327688;
        System.out.println("Number Int: " + numberInt);
        System.out.println("Corresponding int type in byte to: " + Integer.BYTES);
        System.out.println("Corresponding int type in bites to: " + Integer.SIZE);
        System.out.println("Max value of int: " + Integer.MAX_VALUE); // 2147483647
        System.out.println("Min value of int: " + Integer.MIN_VALUE); // -2147483648

        long numberLong = -2147483648L;
        System.out.println("Number Long: " + numberLong);
        System.out.println("Corresponding long type in byte to: " + Long.BYTES);
        System.out.println("Corresponding long type in bites to: " + Long.SIZE);
        System.out.println("Max value of long: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Min value of long: " + Long.MIN_VALUE); // -9223372036854775808

        var numberVar = 127; // It can adapt to any type of data
    }
}
