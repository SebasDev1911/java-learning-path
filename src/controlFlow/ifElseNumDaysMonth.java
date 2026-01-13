package controlFlow;
import java.util.Scanner;
public class ifElseNumDaysMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number of the month 1 - 12: ");
        int month = sc.nextInt();

        int numDays = 0;
        System.out.println("Enter the year (YYYY)");
        int year = sc.nextInt();

        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ){
            numDays = 31;
        }else if (month == 4 || month == 6 || month == 9 || month == 11){
            numDays = 30;
        }else if(month == 2){
            if(year % 400 == 0 || ((year % 4 == 0) && !(year % 100 == 0))){
                numDays = 29;
            }else{
                numDays = 28;
            }
        }
        System.out.println("numDays = " + numDays);
    }
}
