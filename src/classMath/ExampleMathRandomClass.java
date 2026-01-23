package classMath;

import java.util.Random;

public class ExampleMathRandomClass {
    public static void main(String[] args) {
        String[] colors = {"blue", "yellow", "red", "green", "white", "black"};

        // The random method a random number from 0 to 1
        double random = Math.random();
        System.out.println("random = " + random);

        // If a higher range is desired, multiply the random value by the desired range.
        double differentRange = Math.floor(random *= 7); // Number rounded to the floor
        System.out.println("differentRange = " + differentRange);

        // Example of accessing the index of an array using the random method
        double indexColor = Math.random(); // Create number random
        indexColor = Math.floor(indexColor * colors.length); // Round up to the number of positions in the array
        System.out.println("indexColor = " + indexColor);
        System.out.println("Color for index = " + colors[(int) indexColor]); // Convert type integer

        // With Random class is can create objects/instances
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(15); // Return a number random from 0 to 14
        System.out.println("randomInt = " + randomInt);
        
        int randomInt2 = 5 + randomObj.nextInt(15 - 5); // Return a number random from 5 to 15
        System.out.println("randomInt2 = " + randomInt2);

        // ---- Example array using the random object ----
        int indexColor2 = randomObj.nextInt(colors.length);
        System.out.println("indexColor2 = " + indexColor2);
        System.out.println("Color for index = " + colors[indexColor2]);
    }
}
