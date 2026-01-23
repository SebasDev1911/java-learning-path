package arrays;

import java.util.Scanner;

public class ExampleArrayEvenOdd {
    public static void main(String[] args) {
        int[] array, evens, odds;
        int countEven = 0, countOdd = 0;

        Scanner sc = new Scanner(System.in);
        array = new int[10];

        System.out.println("Please enter 10 numbers integer: ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }

        evens = new int[countEven];
        odds = new int[countOdd];

        for(int i = 0; i < array.length; i++){
            if (array[i]%2 == 0){
                evens[--countEven] = array[i];
            }else{
                odds[--countOdd] = array[i];
            }
        }

        System.out.println("Even");
        for (int i = 0; i < evens.length; i++) {
            System.out.print(evens[i] + " " );
        }

        System.out.println("\r\nOdd");
        for (int i = 0; i < odds.length; i++) {
            System.out.print(odds[i] + " ");
        }
    }
}
