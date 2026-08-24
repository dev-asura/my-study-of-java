package module01_basics.exercises;
import java.util.Scanner;

public class primeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int count = 0;

        while (true) {
            System.out.print("Enter a positive integer number bigger than 0 (>= 1): ");

            if(!scanner.hasNextInt()) {
                System.out.println("Invalid input! That is not an integer.");
                scanner.next();
                continue;
            }

            number = scanner.nextInt();

            if(number > 1){
                break;
            } else {
                System.out.println("Invalid input! The number must be >= 1.");
            }
        }

        for(int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
            }
        }

        if(count == 2) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " isn't a prime number.");
        }
        scanner.close();
    }
}
