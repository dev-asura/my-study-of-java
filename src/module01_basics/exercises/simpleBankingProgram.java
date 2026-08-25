package module01_basics.exercises;
import java.util.Scanner;

public class simpleBankingProgram {

    static Scanner scanner = new Scanner(System.in);
    static double balance = 0;

    public static void main(String[] args) {
        boolean isRunning = true;
        int option;

            while(isRunning) {
                System.out.println("*************************");
                System.out.println("*    Banking Program    *");
                System.out.println("*************************");
                System.out.println("1. Show Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.println("*************************");
                System.out.print("Enter your choice (1-4): ");

                while (true) {
                    if (!scanner.hasNextInt()) {
                        System.out.print("Invalid option. Enter your choice (1-4): ");
                        scanner.next();
                        continue;
                    }
                    option = scanner.nextInt();
                    if (option > 4 || option < 1) {
                        System.out.print("Invalid option. Enter your choice (1-4): ");
                    } else {
                        break;
                    }
                }
                switch (option) {
                    case 1 -> showBalance(balance);
                    case 2 -> balance += deposit();
                    case 3 -> balance -= withdraw(balance);
                    case 4 -> isRunning = goodBye();
                }
            }
        scanner.close();
    }
            static void showBalance(double balance){
                System.out.println("*************************");
                System.out.printf("BALANCE: $%,.2f\n", balance);
            }
            static double deposit(){
                double amount;

                System.out.print("Enter an amount to be deposited: ");
                while (true) {
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid number.");
                        System.out.print("Enter a valid amount: ");
                        scanner.next();
                        continue;
                    }
                    amount = scanner.nextDouble();
                    if (amount < 0) {
                        System.out.print("You can't deposit a negative amount.");
                        System.out.print(" Enter a valid amount: ");
                    } else {
                        break;
                    }
                }
                return amount;
            }
            static double withdraw(double balance){
                System.out.print("Enter amount to be withdrawn: ");
                double withdraw;
                while(true){
                    if(!scanner.hasNextDouble()){
                        System.out.print("Enter a valid amount: ");
                        scanner.next();
                        continue;
                    }
                    withdraw = scanner.nextDouble();
                    if(withdraw < 0){
                        System.out.print("The amount can't be negative. Enter a valid amount: ");
                    } else {
                        break;
                    }
                }
                if(balance < withdraw){
                    System.out.println("INSUFFICIENT FUNDS.");
                    return 0;
                } else{
                    return withdraw;
                }
            }
            static boolean goodBye(){
                System.out.println("\n*************");
                System.out.println("* GOOD BYE! *");
                System.out.println("*************");
                return false;
            }
}
