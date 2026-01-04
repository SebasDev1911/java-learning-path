package variables;

public class PrimitiveFloat {
    public static void main(String[] args) {
        // The floating point data type is assigned a value followed by the apostrophe f
        float realFloat = 100f;
        System.out.println("Variable realFloat: "+realFloat);
        System.out.println("Corresponding float type in byte to: " + Float.BYTES);
        System.out.println("Corresponding float type in bites to: " + Float.SIZE);
        System.out.println("Max value of float: " + Float.MAX_VALUE); // 3.4028235E38
        System.out.println("Min value of float: " + Float.MIN_VALUE); // 1.4E-45

        // Using the double data type, not apostrophe is assigned
        double realDouble = 3.4028235E38;
        System.out.println("Variable realDouble: "+ realDouble);
        System.out.println("Corresponding double type in byte to: " + Double.BYTES);
        System.out.println("Corresponding double type in bites to: " + Double.SIZE);
        System.out.println("Max value of double: " + Double.MAX_VALUE); // 3.4028235E38
        System.out.println("Min value of double: " + Double.MIN_VALUE); // 1.4E-45


    }
}
