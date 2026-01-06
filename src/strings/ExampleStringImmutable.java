package strings;

public class ExampleStringImmutable {
    public static void main(String[] args) {
        /* Since string objects are immutable, any change made to them creates a new instance;
         it does not modify the current object.*/

        String course = "Java programming";
        String teacher = "Sebastian Triana";

        String result = course.concat(teacher); // Create a new instance, does not modify the value course
        System.out.println("course = " + course); // It does not alter the course object

        System.out.println(course == result);

        // Lambda function
        String result2 = course.transform(c -> {
            return c.concat(" with ".concat(teacher));
        });
        System.out.println("course = " + course); // It does not modify course the value
        System.out.println("result2 = " + result2); 
        
        String result3 = result.replace("a", "A");
        System.out.println("result = " + result);
        System.out.println("result3 = " + result3);
    }
}
