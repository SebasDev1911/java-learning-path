package arrays.practice;
import java.util.Scanner;

public class ArrayOrderFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrays = new int[10];
        int[] newArrays = new int[arrays.length];

        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter number: ");
            arrays[i] = sc.nextInt();
        }

        int indexNewArray = 0;
        for(int i = 0, j = arrays.length-1; i <= j; i++, j--){
            newArrays[indexNewArray++] = arrays[j];
            if(i != j){
                newArrays[indexNewArray++] = arrays[i];
            }
        }

        for (int i = 0; i < newArrays.length; i++) {
            System.out.println(i + " -> " + newArrays[i]);
        }

        sc.close();
    }
}
