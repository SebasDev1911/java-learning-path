package controlFlow;

public class StatementsLoopsLabels {
    public static void main(String[] args) {

        loop1: for (int i=0; i<5; i++) {

            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue loop1;
                }
                System.out.println("[i = " + i + ", j = " + j + "], ");
            }
        }
    }
}
