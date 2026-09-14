package exercisesInClass;
import java.util.Scanner;

class Exercise1 {
    Scanner sc = new Scanner(System.in);
    int [][] matriz;

    public void llenar(){
        matriz = new int[4][4];
        for (int f = 0; f < 4; f++){
            for (int c = 0; c < 4; c++){
                System.out.print("Please enter a note: ");
                matriz[f][c] = sc.nextInt();
            }
        }
    }

    public void salida(){
        for (int f = 0; f < 4; f++){
            System.out.println("");
            for (int c = 0; c < 4; c++){
                System.out.print(matriz[f][c] + " | ");
            }
        }
    }

    public static void exercise1(String[] args) {
        Exercise1 objeto = new Exercise1();
        objeto.llenar();
        objeto.salida();
    }
}
