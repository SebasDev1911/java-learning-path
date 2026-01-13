package operators.practice;
import java.util.Scanner;
public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variable declaration
        double priceTotal = 0.0;
        double discount = 0.0;

        // User data request
        System.out.print("Write what type of user you are VIP or NORMAL: ");
        String clientType = sc.nextLine();

        System.out.print("Please enter price of product: ");
        double priceProduct = sc.nextDouble();

        // Condition to verify if it is a certain type of client
        if (clientType.equalsIgnoreCase("VIP")){
            discount = priceProduct * 0.2;
            priceTotal = priceProduct - discount;
        } else if (clientType.equalsIgnoreCase("NORMAL")) {
            discount = priceProduct * 0.1;
            priceTotal = priceProduct - discount;
        }else{
            priceTotal = priceProduct;
            System.out.println("You are an unregistered customer");
        }

        // Print result for console
        System.out.println("Origin price: "+priceProduct);
        System.out.println("Discount applied: "+discount);
        System.out.println("Final price: "+priceTotal);

        sc.close();
    }
}
