package controlFlow;
public class sentenceIfElse {
    public static void main(String[] args) {
        float average  = 5.8f;

        if(average >= 6.5){
            System.out.println("Congratulations excellent average");
        }else if (average >= 5.0){
            System.out.println("You have a regular average");
        }
        else{
            System.out.println("You needto put in a little more effort");
        }
    }
}
