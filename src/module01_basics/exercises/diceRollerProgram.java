package module01_basics.exercises;
import java.util.Scanner;
import java.util.Random;

public class diceRollerProgram {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        // JAVA DICE ROLLER PROGRAM

        int numberOfDice;
        int total = 0;
        int roll = 0;

        System.out.print("Enter the number of dice to roll (> 0): ");
        while(true){
            if(!scanner.hasNextInt()){
                System.out.print("Invalid number (must be a positive integer). Try again: ");
                scanner.next();
                continue;
            }

            numberOfDice = scanner.nextInt();

            if(numberOfDice < 1){
                System.out.print("Invalid number (must be a positive integer). Try again: ");
            } else{
                break;
            }
        }

        for(int i = 1; i <= numberOfDice; i++){
            roll = random.nextInt(1, 7);
            System.out.println("Rolling...");
            Thread.sleep(1000);
            System.out.println("You rolled: " + roll);
            printDie(roll);
            total += roll;
        }

        System.out.println("The sum of your rolls is: " + total);

        scanner.close();
    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
        }
    }
}
