package controlFlow;

public class SentenceForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};

        // // for-each iterates over each element without an index
        for(int num:numbers){
            System.out.println("num = " + num);
        }

        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Sebastian"};
        for (String name:names ){
            System.out.println("name = " + name);
        }
    }
}
