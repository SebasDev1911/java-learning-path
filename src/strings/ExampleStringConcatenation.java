package strings;

public class ExampleStringConcatenation {
    public static void main(String[] args) {
        String course = "Java programming";
        String teacher = "Sebastian Triana";

        String detail = course + " with the teacher " + teacher;
        System.out.println(detail);

        int numberA = 10;
        int numberB = 5;

        // When evaluating a string data type first, it concatenates subsequents string instead of
        // operating on them
        System.out.println(detail + numberA + numberB); // 105
        // Enclosing in parentheses operates and then concatenates
        System.out.println(detail + (numberA + numberB)); // 15
        // The order dictates that the operation is performed first and then the concatenation is performed
        System.out.println(numberA + numberB + detail); // 15

        // Another form concatenation, method .concat()
        String detail2 = course.concat(" ".concat(teacher)); // Return another string, objects are immutable
        System.out.println("detail2 = " + detail2);
    }
}
