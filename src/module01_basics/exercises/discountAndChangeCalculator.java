package module01_basics.exercises;
import java.util.Scanner;

public class discountAndChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total;
        double discount;
        double change;

        System.out.println("DISCOUNT AND CHANGE CALCULATOR");
        System.out.println("******************************");
        System.out.print("Enter the total purchase amount: ");

        while(true) {
            if (!scanner.hasNextDouble()) {
                System.out.print("Invalid amount. Enter the total purchase amount: ");
                scanner.next();
                continue;
            }
            total = scanner.nextDouble();

            if (total < 0) {
                System.out.print("Invalid amount. Enter the total purchase amount: ");
            } else {
                break;
            }
        }

        System.out.print("Enter the % of discount (between 5% - 20%): ");
        while (true){
            if (!scanner.hasNextDouble()) {
                System.out.print("Invalid number. Enter the discount (between 5% - 20%): ");
                scanner.next();
                continue;
            }
            discount = scanner.nextDouble();

            if (discount < 5 || discount > 20) {
                System.out.print("Invalid number. Enter the discount (between 5% - 20%): ");
            } else {
                break;
            }
        }

        discount = (total * discount)/100;
        total -= discount;
        System.out.println("******************************");
        System.out.printf("The discounted price is: $%.2f\n", total);
        System.out.println("******************************");

        System.out.println("How much are you going to give to the cashier?");
        while (true){
            if (!scanner.hasNextDouble()) {
                System.out.print("Invalid amount. Enter the right amount: ");
                scanner.next();
                continue;
            }
            change = scanner.nextDouble();

            if (change < total) {
                System.out.print("Invalid amount. Enter the right amount: ");
            } else {
                break;
            }
        }

        if(change == total){
            System.out.println("Thanks for coming! Bye!");
        } else {
            change -= total;
            System.out.printf("Your change is: $%.2f. \nThanks for coming! Bye!", change);
        }
        scanner.close();
    }
}
