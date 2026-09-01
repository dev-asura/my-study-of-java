package module01_basics.exercises;
import java.util.Scanner;
import java.util.Random;

public class numberGuessingGameWithAttempts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(1, 51);
        int guess;
        int attempts = 0;

        System.out.println("**************************************");
        System.out.println("* Number Guessing Game With Attempts *");
        System.out.println("**************************************");
        System.out.print("I generate a number between 1-50, try to guess it: ");
        while(true) {
            if(!scanner.hasNextInt()){
                attempts++;
                System.out.print("Enter a valid number between 1-50: ");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            if(guess > 50) {
                attempts++;
                System.out.print("Enter a valid number between 1-50: ");
            } else if(guess < 1) {
                attempts--;
                System.out.print("Enter a valid number between 1-50: ");
            }else{
                break;
            }
        }

        while(guess != randomNumber) {
            attempts++;
            if(guess > randomNumber) {
                System.out.print("The number is lower than your guess. Try again: ");
                while(true) {
                    if(!scanner.hasNextInt()){
                        System.out.print("Enter a valid number between 1-50: ");
                        scanner.next();
                        continue;
                    }
                    guess = scanner.nextInt();
                    if(guess > 50) {
                        System.out.print("Enter a valid number between 1-50: ");
                    } else if(guess < 1) {
                        System.out.print("Enter a valid number between 1-50: ");
                        attempts--;
                    } else {
                        break;
                    }
                }
            } else {
                System.out.print("The number is higher than your guess. Try again: ");
                while(true) {
                    if(!scanner.hasNextInt()){
                        System.out.print("Enter a valid number between 1-50: ");
                        scanner.next();
                        continue;
                    }
                    guess = scanner.nextInt();
                    if(guess > 50 || guess < 1) {
                        System.out.print("Enter a valid number between 1-50: ");
                    }else if(guess < 1) {
                        System.out.print("Enter a valid number between 1-50: ");
                        attempts--;
                    } else {
                        break;
                    }
                }
            }
        }

        attempts++;
        System.out.println("Congratulations, you hit the nail on the head!");
        System.out.println("Your attempts: " + attempts);

        scanner.close();
    }
}
