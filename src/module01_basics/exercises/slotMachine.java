package module01_basics.exercises;
import java.util.Random;
import java.util.Scanner;

public class slotMachine {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100000;
        int bet;
        int payout;
        String playAgain = "yes";
        String[] row = {"🍒","🍉","🍋","🔔","⭐"};
        String[] spin = new String[3];

        System.out.println("******************************");
        System.out.println("*  Welcome to Java Slots     *");
        System.out.println("*  Symbols: 🍒 🍉 🍋 🔔 ⭐  *");
        System.out.println("******************************");

        while(playAgain.equals("yes")) {
            if(balance == 0){
                System.out.println("You are out of money! Game over.");
                break;
            }
            System.out.println("Current balance: $" + balance);
            System.out.print("Enter your bet amount (Integer number): ");
            while(true){
                if(!scanner.hasNextInt()){
                    System.out.print("Invalid amount. Enter an integer amount: ");
                    scanner.next();
                    continue;
                }
                bet = scanner.nextInt();
                scanner.nextLine();
                if(bet <= 0 || bet > balance){
                    System.out.print("Amount must be > 0 and < " + balance + " .Enter your bet amount: ");
                } else {
                    break;
                }
            }
            balance -= bet;

            for(int i = 0; i <= 2; i++){
                spin[i] = row[random.nextInt(5)];
            }

            System.out.print("Spinning");
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
            System.out.print(".");
            Thread.sleep(300);
            System.out.print(".");
            System.out.println();

            System.out.println("******************");
            for(int i = 0; i < spin.length; i++){
                System.out.print(" | ");
                System.out.print(spin[i]);
            }
            System.out.print(" | ");
            System.out.println("\n******************");

            if(spin[0].equals(spin[1]) && spin[1].equals(spin[2])) {
                System.out.println("JACKPOT!");
                balance += (bet * 5);
            } else if (spin[0].contains(row[4]) || spin[1].contains(row[4]) || spin[2].contains(row[4])) {
                System.out.println("LOOK THE STAR! Bonus: $30,00");
                balance += 30;
            } else{
                System.out.println("You lose.");
            }

            System.out.print("\nPlay again (yes / no): ");
            playAgain = scanner.nextLine().toLowerCase();
            if(!playAgain.equals("yes")){
                break;
            }
        }
        scanner.close();
    }
}
