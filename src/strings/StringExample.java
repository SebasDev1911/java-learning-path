package strings;

public class StringExample {
    public static void main(String[] args) {
        // Create an instance of the String class below since it is not literal
        String course = "Java programming";

        // Another way to create a new object instance, literal
        String course2 = new String("Java programming");

        // Comparison between the crated instances, verifying if they are the same objects
        boolean comparisonObject = (course == course2);
        System.out.println("comparisonObject = " + comparisonObject); // Two instance different

        // The equals method compares instance value, unlike == which only checks if they are the same object
        boolean equalObject = course.equals(course2);
        System.out.println("equalObject = " + equalObject);

        // The equalsIgnoreCase method, it is used to compare whether the values of the objects are the same, ignoring
        // any type of accent or capital letters
        System.out.println(course.equalsIgnoreCase(course2)); // "Hello" = "hello" TRUE
    }
}
