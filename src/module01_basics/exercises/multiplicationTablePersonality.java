package module01_basics.exercises;
import java.util.Scanner;

public class multiplicationTablePersonality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int result;
        System.out.print("Enter an integer number and this program will return the multiplication table from 1 to 10: ");

        while(!scanner.hasNextInt()){
            System.out.print("Enter invalid! Enter an integer number: ");
            scanner.next();
        }
        number = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            result = i * number;
            System.out.println(number + " * " + i + " = " + result);
        }

        scanner.close();
    }
}
