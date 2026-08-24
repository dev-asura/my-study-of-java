package module01_basics.exercises;
import java.util.Scanner;

public class factorialOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int factorial = 1;

        System.out.print("This program will calculate the factorial of your positive integer number: ");
        number = scanner.nextInt();

        for(int i = number;i >= 1; i--){
            factorial *= i;
        }

        System.out.println(number + "! = " + factorial);

        scanner.close();
    }
}
