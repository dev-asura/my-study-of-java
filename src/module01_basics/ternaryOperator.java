package module01_basics;
import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable (condition) ? ifTrue : ifFalse

        /*
        int number;
        String evenOrOdd;

        System.out.print("Enter an integer number between 0-100: ");
        number = scanner.nextInt();
        number %= 2;
        evenOrOdd = (number == 1) ? "ODD" : "EVEN";
        System.out.println(evenOrOdd);
        */

        int hours = 12;

        String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeOfDay);


    }
}
