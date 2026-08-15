package module01_basics;
import java.util.Scanner;

public class shoppingCartProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Shopping cart program
        String item;
        double price;
        int quantity;
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        total = quantity * price;

        System.out.println("You have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is: $" + total);





    }
}
