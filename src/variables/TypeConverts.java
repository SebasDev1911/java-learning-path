package variables;

public class TypeConverts {
    public static void main(String[] args) {
        String strNumber = "50";

        int intNumber = Integer.parseInt(strNumber);
        System.out.println("intNumber = " + intNumber);

        String strReal = "98765.43";
        double doubleReal = Double.parseDouble(strReal);
        System.out.println("doubleReal = " + doubleReal);
        
        String strBoolean = "FalsE";
        boolean booleanLogic = Boolean.parseBoolean(strBoolean);
        System.out.println("booleanLogic = " + booleanLogic);

        int anotherInt = 100;
        System.out.println("anotherInt = " + anotherInt);
        String anotherStr = Integer.toString(anotherInt);
        System.out.println("anotherStr = " + anotherStr);
    }
}
