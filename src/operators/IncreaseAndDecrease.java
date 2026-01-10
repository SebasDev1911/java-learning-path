package operators;

public class IncreaseAndDecrease {
    public static void main(String[] args) {
        // PRE INCREMENT
        int i = 1;
        int j = ++i; // i = i + 1, increases, then it is assigned

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POST INCREMENT
        i = 2;
        // The value of "i" is assigment to the variable "j" and then the value of "i" is increment
        j = i++;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // PRE DECREMENT
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // POST DECREMENT
        i = 4;
        j = i--; 
        System.out.println("j = " + j);
        System.out.println("i = " + i);

        System.out.println("(++j) = " + (++j)); // 5
        System.out.println("(j++) = " + (j++)); // 5
        System.out.println("j = " + j); // 6
    }
}
