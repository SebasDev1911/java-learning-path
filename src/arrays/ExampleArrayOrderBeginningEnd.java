package arrays;

public class ExampleArrayOrderBeginningEnd {
    public static void main(String[] args) {
        // Create arrays of 10 elements type int
        int[] numbers = new int[10];
        int[] a = new int[10];

        // Iterate array numbers for add element
        int total = numbers.length;
        for(int i=0; i<total; i++){
            numbers[i] = i + 1;
        }

        // Iteration of array a, to add even elements from 0 to 10
        int aux = 0;
        for(int i=0; i<total/2; i++){
            System.out.println("number = " + numbers[i]);
            System.out.println("number = " + numbers[total-1-i]);

            a[aux++] = numbers[i];
            a[aux++] = numbers[total-1-i];
        }

        // Print elements of array a
        for (int i = 0; i < a.length; i++){
            System.out.println("i = " + i + " = " + a[i]);
        }
    }
}
