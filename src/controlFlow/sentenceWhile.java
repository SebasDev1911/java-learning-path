package controlFlow;

public class sentenceWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean proof = true;
        while(proof){
            if(i==7){
                proof = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        proof = false;
        do {
            System.out.println("It runs at least once");
        }while(proof);
    }
}
