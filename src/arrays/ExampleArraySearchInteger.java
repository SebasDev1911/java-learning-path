package arrays;

import java.util.Scanner;

public class ExampleArraySearchInteger {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++){
            System.out.print("Please enter a number integer: ");
            a[i] = sc.nextInt();
        }

        System.out.print("\r\nPlease enter the number to search: ");
        int search = sc.nextInt();
        int[] indexPosition;
        int countPosition = 0;
        
        for(int i = 0; i < a.length; i++ ){
            if (a[i] == search){
                countPosition++;
            }
        }
        indexPosition = new int[countPosition];

        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < indexPosition.length; j++) {
                if(a[i] == search){
                    indexPosition[j] = a[i];
                }
            }
        }

        for (int i = 0; i < indexPosition.length; i++) {
            System.out.print("Found in the position: "+indexPosition[i]);
        }

    }
}
