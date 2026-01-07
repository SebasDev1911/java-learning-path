package strings;
import java.util.Scanner;
public class NameManagementProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the first name: ");
        String firstName = sc.nextLine();

        System.out.print("Please enter the second name: ");
        String secondName = sc.nextLine();

        System.out.print("Please enter the third name: ");
        String thirdName = sc.nextLine();

        String firstNameNew = formatName(firstName);
        String secondNameNew = formatName(secondName);
        String thirdNameNew = formatName(thirdName);

        StringBuilder sb = new StringBuilder();
        sb.append(firstNameNew)
                .append("_")
                .append(secondNameNew)
                .append("_")
                .append(thirdNameNew);

        System.out.println(sb);

        sc.close();
    }

    private static String formatName(String name) {
        String letter = name.substring(1, 2).toUpperCase();
        String lastChars = name.substring(name.length() - 2);
        return letter + "." + lastChars;
    }
}
