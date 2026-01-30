package arrays.practice;
import java.util.Random;

public class ArrayHighestOccurrence {
    public static void main(String[] args) {
        Random rdm = new Random();

        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            int number = 1 + rdm.nextInt(9 - 1 + 1);
            arrays[i] = number;
        }

        int occurrenceRepeated, elementRepeated = 0, occurrencesValidate = 0;
        for (int i = 0; i < arrays.length; i++) {
            occurrenceRepeated = 0;

            for (int j = 0; j < arrays.length; j++) {
                if(arrays[i] == arrays[j]){
                    occurrenceRepeated++;
                }
            }

            if(occurrenceRepeated >= occurrencesValidate){
                occurrencesValidate = occurrenceRepeated;
                elementRepeated = arrays[i];
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }

        System.out.println();
        System.out.println("The greatest occurrence is: " + occurrencesValidate);
        System.out.println("The element that is repeated the most is: " + elementRepeated);
    }
}
