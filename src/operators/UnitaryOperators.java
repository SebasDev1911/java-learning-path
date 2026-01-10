package operators;

public class UnitaryOperators {
    public static void main(String[] args) {
        // Unary operators allow multiplication of signs
        int i = -5;
        int j = +i; // j = (1)*i => -5
        System.out.println("j = " + j);
        
        int k = -i; // j = (-1)*i => 5
        System.out.println("k = " + k);

        i = 6;
        j = +6; // j = (1)*i => 6
        System.out.println("j = " +j);

        k = -i; // k = (-1)*i => -6
        System.out.println("k = " + k);
    }
}
