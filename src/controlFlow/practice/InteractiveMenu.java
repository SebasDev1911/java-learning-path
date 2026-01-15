package controlFlow.practice;
import java.util.Scanner;

public class InteractiveMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;

        do {
            // Product menu
            System.out.println("WELCOME TO PRODUCT MENU" +
                    "\n1. Update" +
                    "\n2. Drop" +
                    "\n3. Create" +
                    "\n4. List" +
                    "\n5. Exit");
            try {
                System.out.print("\nSelect an option according to the number: ");
                option = sc.nextInt();

                if (option <=0 || option>5){
                    System.out.println("RE ENTER A NUMBER!!\n");
                }else{
                    switch (option){
                        case 1:
                            System.out.println("\nSuccessfully updated product\n");
                            break;
                        case 2:
                            System.out.println("\nProduct disposed correctly\n");
                            break;
                        case 3:
                            System.out.println("\nSuccessfully created product\n");
                            break;
                        case 4:
                            System.out.println("\nProduct list\n");
                            break;
                    }
                }
            }catch(Exception e){
                System.out.println("Make sure you select a number");
                sc.nextLine();
            }
        }while(option != 5);

        System.out.println("You have successfully exited");
        sc.close();
    }
}
