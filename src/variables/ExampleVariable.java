package variables;

import java.util.Locale;

public class ExampleVariable {
    public static void main(String[] args) {
        // Not primitive data type, this is a class whose instances have methods
        String message = "Hello world";

        // Method of instance for class not primitive String
        System.out.println(message+" - "+message.toUpperCase());

        int variablePrimitive = 10; // It has not method
        Integer variableNotPrimitive = 10; // It has methods

        boolean value = false; // True - False

        // Conditional.
        if (value){
            System.out.println(variablePrimitive);
        }else{
            System.out.println(variableNotPrimitive.doubleValue());
        }
    }
}
