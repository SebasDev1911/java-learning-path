package operators;

public class InstancesOfOperator {
    public static void main(String[] args) {
        /* The instencesOf property allows you to validate whether a created object or instance is created by a particular class or inherited from a particular class */
        String text = "Create a object of the String class";
        Integer num = 7;

        boolean b1 = text instanceof String;
        System.out.println("Text is of the String type = " + b1);

        b1 = text instanceof Object;
        System.out.println("Text is of the Object type = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num is of the Integer type = " + b1);
    }
}
