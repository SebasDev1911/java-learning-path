package strings;
import java.util.Scanner;

public class ExercisePracticeMethods {
    public static void main(String[] args) {
        // 1. Length of a String
        // Calculates the number of characters in the string
        String characters = "character";
        System.out.println("length of characters:" + characters.length());

        // 2. Convert String to uppercase and lowercase
        System.out.println("Uppercase: " + characters.toUpperCase());
        System.out.println("Lowercase: " + characters.toLowerCase());

        // 3. Get specific characters from a String
        // First character
        System.out.println("Characters specific character = " + characters.charAt(0));
        // Last character
        System.out.println(characters.charAt(characters.length()-1));

        // 4. String comparison using equals()
        String stringOne = "String";
        String stringTwo = "string";

        boolean isEquals = stringOne.equals(stringTwo);
        if (isEquals){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        };

        // 5. String comparison ignoring case sensitivity
        boolean isEqualsIgnore = stringOne.equalsIgnoreCase(stringTwo);
        if (isEqualsIgnore){
            System.out.println("Strings are equal (ignoring case)");
        }else{
            System.out.println("Strings are not equal (ignoring case)");
        };

        // 6. Check if a String contains a specific character or substring
        System.out.println("Contains the word 'S': " + stringOne.toLowerCase().contains("s"));

        // 7. Extract part of a string using substring
        System.out.println(stringOne.substring(stringOne.length()-5));

        // 8. Replace characters in a String
        System.out.println(stringOne.replace("g", "3"));

        // 9. Remove leading and trailing whitespace
        String withSpace = "  with space ";
        System.out.println(withSpace.trim());

        // 10. Simple email validation
        String email = "sebastiantriana@gmail.com";
        System.out.println(email.lastIndexOf("@"));
        System.out.println(email.contains("."));

        // 11. Count vowels in a String
        String vowels = "aeiou";
        String email2 = email.toLowerCase();
        int count = 0;
        for (int i=0; i <= email2.length()-1; i++){
            for (int j=0; j<=vowels.length()-1; j++){
                if (email2.charAt(i) == vowels.charAt(j)){
                    count += 1;
                }
            }
        }
        System.out.println("Vowels: "+count);

        // 12. Reverse a String
        String word = "hello";
        StringBuilder sb = new StringBuilder();
        for (int i=0; i <= word.length()-1; i++){
            int character = (word.length()-1)-i;
            sb.append(word.charAt(character));
        };
        System.out.println(sb.toString());

        // 13. Username and password validation
        String userName = "admin";
        String password = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter this username: ");
        String userNameSC = sc.nextLine();

        System.out.println("Please enter this password");
        String passwordSC = sc.nextLine();

        if (userNameSC.equals(userName) && passwordSC.equals(password)){
            System.out.println("Correct credential");
        }else{
            System.out.println("Incorrect credential");
        }

        sc.close();
    }
}
