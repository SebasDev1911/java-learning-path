package controlFlow;

import javax.swing.*;

public class sentenceForArrays {
    public static void main(String[] args) {
        String[] names = {"Andres", "Pepe", "Maria", "Paco", "Sebastian"};
        int count = names.length;

        for (int i = 0; i < count; i++){
            if(names[i].equals("Andres") || names[i].equals("PACO")){
                continue;
            }
            System.out.println(i + " - " + names[i]);
        }

        String search = JOptionPane.showInputDialog("Please enter a name, example \"Pepe\" or \"Paco\"");
        System.out.println("search = " + search);

        boolean found = false;
        for (int i=0; i<count; i++){
            if(names[i].equalsIgnoreCase(search)){
                found = true;
                break;
            }
        }

        if (found){
            JOptionPane.showMessageDialog(null, search + "was found");
        }else{
            JOptionPane.showMessageDialog(null, search + "does not exist in the sistem");
        }

    }
}
