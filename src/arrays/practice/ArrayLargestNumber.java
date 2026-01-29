package arrays.practice;
import java.util.Random;

public class ArrayLargestNumber {
    public static void main(String[] args) {
        // Import class random. Get number random
        Random rdm = new Random();

        // Fill the array with random numbers from (11 - 99)
        int[] arrays = new int[7];
        for (int i = 0; i < arrays.length; i++) {
            int number = 11 + rdm.nextInt(99 - 11 + 1);
            arrays[i] = number;
        }

        // Find the largest number
        int max = 0;
        for (int i = 0; i < arrays.length; i++) {
            if(arrays[i] >= max){
                max = arrays[i];
            }
        }

        // Show element array
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + ", ");
        }

        System.out.println("-> Largest number = " + max);
    }
}
