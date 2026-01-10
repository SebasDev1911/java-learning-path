package operators;
import javax.swing.*;
import java.util.Scanner;

public class LogicOperatorsLogin {
    public static void main(String[] args) {
        String username = JOptionPane.showInputDialog("Please enter your username: ");
        String password = JOptionPane.showInputDialog("Please enter your password: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please confirm your username: ");
        String usernameValidate = sc.nextLine();

        System.out.println("Please confirm your password: ");
        String passwordValidate = sc.nextLine();

        // Authenticated with credentials
        boolean isAuthenticated = false;
        if(username.equals(usernameValidate) && password.equals(passwordValidate)){
            isAuthenticated = true;
            System.out.println("Correct credential");
        }else{
            System.out.println("Incorrect credential");
        }

        if(isAuthenticated){
            System.out.println("Welcome user ".concat(username).concat("!"));
        }else{
            System.out.println("Sorry, authentication is required");
        }
        sc.close();
    }
}
