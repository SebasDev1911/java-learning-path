package variables;

public class Characters {
    public static void main(String[] args) {
        char character = 'a';
        char unicode = '\u0040'; //@
        char characterDecimal = 64; //@
        char simbol = '@'; // @
        System.out.println("Character value = "+character);
        System.out.println("Unicode value = "+unicode);
        System.out.println("Character decimal value = "+characterDecimal);

        System.out.println(unicode == characterDecimal); // True

        // Test unicode
        char space = '\u0020';
        System.out.println("Hello\u0020world"); // Hello world
        System.out.println("Hello"+space+"world"); // Hello world

        char recoil = '\b';
        System.out.println("Hello\bworld"); // Hellworld
        System.out.println("Hello"+recoil+"world"); // Hellworld

        char tabulator = '\t';
        System.out.println("Hello\tworld"); // Hello    world
        System.out.println("Hello"+tabulator+"world"); // Hello     world

        char newLine = '\n';
        System.out.println("Hello\nworld");
        System.out.println("Hello"+newLine+"world");

        char returnCar = '\r';
        System.out.println("Hello\rworld");
        System.out.println("Hello"+returnCar+"world");
    }
}
