package classWrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitive = 32423;
        Integer intObject = Integer.valueOf(intPrimitive);
        Integer intObject2 = 23432;
        System.out.println("intObject = " + intObject);

        int num = intObject;
        System.out.println("num = " + num);
        int num2 = intObject.intValue();
        System.out.println("num2 = " + num2);

        String valueTvLcd = "23423";
        Integer value = Integer.valueOf(valueTvLcd);
        System.out.println("value = " + value);
        
        Short shortObject = 32767;
        System.out.println("shortObject = " + shortObject);
        
        Byte byteObject = intObject.byteValue();
        System.out.println("byteObject = " + byteObject);
    }
}
