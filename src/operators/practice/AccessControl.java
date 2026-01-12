package operators.practice;
import java.util.Scanner;
public class AccessControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialization of variables
        String username = "admin";
        String password = "1234";
        int minAge = 18;

        // Data request
        System.out.print("Please enter your username: ");
        String storeUsername = sc.nextLine();

        System.out.print("Please enter your password: ");
        String storePassword = sc.nextLine();

        System.out.print("Please enter your age: ");
        int storeAge = sc.nextInt();

        // Validation and authentication
        boolean access = (username.equals(storeUsername)
                && password.equals(storePassword)
                && (storeAge >= minAge) );

        if (access){
            System.out.println("Access granted");
        }else{
            System.out.println("Access denied");
        }
        sc.close();
    }
}
