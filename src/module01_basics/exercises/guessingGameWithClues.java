package module01_basics.exercises;
import java.util.Scanner;
import java.util.Random;

public class guessingGameWithClues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber;
        int userGuess;
        int diff;

        randomNumber = random.nextInt(1, 51);

        System.out.print("I generate a random number between 1 and 50, try to guess: ");
        userGuess = scanner.nextInt();

        diff = Math.abs(randomNumber - userGuess);

        if(userGuess > 50 || userGuess < 1){
            System.out.println("You number isn't between 1 and 50.");
        } else {
            if(userGuess == randomNumber){
                System.out.println("Congratulations, you hit the nail on the head!");
            } else {
                if (diff <= 3){
                    System.out.println("That was close, really close!");
                    System.out.println("There's my number: " + randomNumber + ". There's your guess: " + userGuess + ".");
                } else {
                    System.out.println("You were wrong, the number was: " + randomNumber + ". \nThanks for play!");
                }
            }
        }
        scanner.close();
    }
}
