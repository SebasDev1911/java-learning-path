package strings;

public class ExampleStringValidate {
    public static void main(String[] args) {
        String course = null;
        boolean isNull = course == null; // Check if the object has a null value
        if (isNull){
            course = " ";
        }

        boolean isEmpty = course.length() == 0; // Returns the number of characters in the String
        System.out.println("isEmpty = " + isEmpty);

        boolean isEmpty2 = course.isEmpty(); // Return if the variables are empty
        System.out.println("isEmpty2 = " + isEmpty2);

        boolean isWhite = course.isBlank(); // Checks if the variables have whitespace, are null or are empty
        System.out.println("isWhite = " + isWhite); // RECOMMENDED FOR FORMS

        if (!isEmpty){ // Simbol ! => negation
            System.out.println(course.toUpperCase());
            System.out.println("Welcome to course ".concat(course));
        }
    }
}
