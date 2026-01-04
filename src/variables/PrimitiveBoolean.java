package variables;

public class PrimitiveBoolean {
    public static void main(String[] args) {
        boolean logicData = true;
        System.out.println("logicData = " + logicData);

        // Evaluation of expressions
        double numberDouble = 123.123;
        float numberFloat = 123.4e-10f;

        logicData = (numberDouble < numberFloat);

        System.out.println("logicData = " + logicData);
    }
}
