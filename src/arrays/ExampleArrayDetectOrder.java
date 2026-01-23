package arrays;

import java.util.Scanner;

public class ExampleArrayDetectOrder {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter seven number: ");
        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        boolean upward = false;
        boolean falling = false;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                falling = true;
            }

            if(a[i] < a[i+1]){
                upward = true;
            }
        }

        if(upward == true && falling == true){
            System.out.println("Disordered arrangement");
        }
        if(upward == false && falling == false){
            System.out.println("All elements are equals");
        }
        if(upward == true && falling == false){
            System.out.println("Ascending array");
        }
        if(upward == false && falling == true){
            System.out.println("Descending array");
        }
    }
}
