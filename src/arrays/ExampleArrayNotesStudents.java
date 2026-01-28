package arrays;

import java.util.Scanner;

public class ExampleArrayNotesStudents {
    public static void main(String[] args) {
        double[] classMath, classStory, classLanguage;
        int addNotesMath=0, addNotesStory=0, addNotesLanguage=0;

        classMath = new double[7];
        classStory = new double[7];
        classLanguage = new double[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 7 notes of student for math");
        for(int i=0; i<classMath.length; i++){
            classMath[i] = sc.nextDouble();
        }

        System.out.println("Please enter 7 notes of student for story");
        for(int i=0; i<classStory.length; i++){
            classStory[i] = sc.nextDouble();
        }

        System.out.println("Please enter 7 notes of student for language");
        for(int i=0; i<classLanguage.length; i++){
            classLanguage[i] = sc.nextDouble();
        }


        for(int i=0; i<7; i++){
            addNotesMath += classMath[i];
            addNotesStory += classStory[i];
            addNotesLanguage += classLanguage[i];
        }

        System.out.println("Property class Math: "+(addNotesMath/classMath.length));
        System.out.println("Property class Story: "+(addNotesStory/classStory.length));
        System.out.println("Property class Language: "+(addNotesLanguage/classLanguage.length));
    }
}
