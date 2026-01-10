package operators;
import java.util.Scanner;

public class LogicOperatorsLoginArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create string array to store usernames and passwords with a number of positions initialized to 2
        String[] usernames = new String[2];
        String[] passwords = new String[2];

        // Data for arrays in the position 0 and 1
        usernames[0] = "admin";
        passwords[0] = "1234";

        usernames[1] = "sebas";
        passwords[1] = "1234";

        // Input of data by user for validation and authentication
        System.out.println("Please enter your username: ");
        String storeUser = sc.nextLine();
        System.out.println("Please enter your password: ");
        String storePassword = sc.nextLine();

        // Credential validation
        boolean isAuthenticated = false;
        for (int i = 0; i <= usernames.length-1; i++){
            if (storeUser.equals(usernames[i]) && storePassword.equals(passwords[i])){
                isAuthenticated = true;
                break;
            }
        }

        if(isAuthenticated){
            System.out.println("Welcome user ".concat(storeUser).concat("!"));
        }else{
            System.out.println("Authentication failed, username or password incorrect");
        }
        sc.close();
    }
}
