package module01_basics.exercises;
import java.util.Scanner;
public class customMadLibsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective01 = scanner.nextLine().toLowerCase();

        System.out.print("Enter a noun: ");
        String noun01 = scanner.nextLine().toLowerCase();

        System.out.print("Enter a name of a person: ");
        String person = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb01 = scanner.nextLine().toLowerCase();

        System.out.print("Enter a plural noun: ");
        String noun02 = scanner.nextLine().toLowerCase();

        System.out.print("Enter an adjective: ");
        String adjective02 = scanner.nextLine().toLowerCase();

        System.out.print("Enter a number: ");
        int integerNumber = scanner.nextInt();

        System.out.print("Enter an decimal number: ");
        double decimalNumber = scanner.nextDouble();

        System.out.printf("In the year 3026, humanity sent a %s spaceship to explore Planet %s. Captain %s was in charge of the crew. Suddenly, the main engine %s and hundreds of %s started falling from the sky. The outcome was completely %s. After %d days of chaos, the mission was canceled, costing a total of $%.2f billion dollars.", adjective01, noun01,person, verb01, noun02, adjective02, integerNumber, decimalNumber);

        scanner.close();
    }
}
