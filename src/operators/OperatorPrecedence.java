package operators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        double average = (i + j + k) / 3;
        System.out.println("average = " + average);

        double average2 = i + j + (k / 3);
        System.out.println("average2 = " + average2);

        double average3 = i + j + k / (3 * 10);
        System.out.println("average3 = " + average3);
    }
}