package module01_basics.exercises;
import java.util.Scanner;

public class hypotenuseAndRoundingCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the value of A: ");
        a = scanner.nextDouble();
        System.out.print("Enter the value of B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.printf("\nThe hypotenuse is %.2f\n", c);
        System.out.println("The value rounded up is: " + Math.ceil(c));
        System.out.println("The value rounded down is: " + Math.floor(c));
        System.out.println("The value default rounded is: " + Math.round(c));

        scanner.close();
    }
}
