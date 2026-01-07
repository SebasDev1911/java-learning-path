package strings;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Sebastian";

        // .length(): Allows you to obtain the number of characters
        System.out.println("name.length() = " + name.length());

        // .toUpperCase(): Convert the string to capital letters
        System.out.println("name.toUpperCase() = " + name.toUpperCase());

        // .toLowerCase(): Convert the string lower case
        System.out.println("name.toLowerCase() = " + name.toLowerCase());

        // .equals(): Compare if two value are the same, being sensitive to how it is written
        System.out.println("name.equals(\"Sebastian\") = " + name.equals("Sebastian"));
        System.out.println("name.equals(\"sebastian\") = " + name.equals("sebastian"));

        // .equalsIgnoreCaase(): It's the same as the .equals() method, ignoring the sensitivity of how it's written
        System.out.println("name.equalsIgnoreCase(\"sebastian\") = " + name.equalsIgnoreCase("sebastian"));

        System.out.println("name.compareTo(\"Sebastian\") = " + name.compareTo("Sebastian"));
        System.out.println("name.compareTo(\"Sebastian\") = " + name.compareTo("Andres"));

        // .charAt(): Gets the character corresponding to the index of the string
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(0) = " + name.charAt(1));

        // .replace(): Replace a character in the string with the value passed as a parameter
        String tongueTwister = "tongue Twister";
        System.out.println("tongueTwister.replace(\"e\", \"Y\") = " + tongueTwister.replace("e", "Y"));
        System.out.println("tongueTwister = " + tongueTwister); // It does not value of the variables, is immutable

        // .indexOf(): Return and validates the position where the value passed as a parameter is located
        System.out.println("tongueTwister.indexOf(\"o\") = " + tongueTwister.indexOf("o"));

        // .lastIndexOf(): Search the last occurrence
        // IMPORTANT: If the value is negative, it is because it did not find the value it was looking for -1
        System.out.println("tongueTwister.lastIndexOf(\"e\") = " + tongueTwister.lastIndexOf("e"));

        // .contains(): Validates whetther the character or string passed as a parameter is found, returning true or false
        System.out.println("tongueTwister.contains(\"Tw\") = " + tongueTwister.contains("Tw"));

        // .startsWith(): Validate if string starts with the string passed as a parameter
        System.out.println("tongueTwister.startsWith(\"t\") = " + tongueTwister.startsWith("t"));
        System.out.println("tongueTwister.endsWith(\"ter\") = " + tongueTwister.endsWith("ter"));

        // .trim(): Removes whitespace from a string
        System.out.println(" tongue Twister  ");
        System.out.println(" tongue Twister  ".trim());
    }
}
