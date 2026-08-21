package module01_basics.exercises;
import java.util.Scanner;
public class calculatorProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        double firstNumber;
        double secondNumber;
        String mathOperator;
        double result = 0;

        System.out.println("######################");
        System.out.println("# CALCULATOR PROGRAM #");
        System.out.println("######################");

        System.out.print("\nEnter the first number: ");
        firstNumber = scanner.nextDouble();
        scanner.nextLine();
        do {
            System.out.print("Enter which mathematical operation do you want to use (+, -, *, /, ^): ");
            mathOperator = scanner.nextLine();
            } while(!mathOperator.equals("+") && !mathOperator.equals("-") && !mathOperator.equals("*") && !mathOperator.equals("/") && !mathOperator.equals("^"));

        System.out.print("Enter the second number: ");
        secondNumber = scanner.nextDouble();

        switch (mathOperator) {
            case "+" -> result = firstNumber + secondNumber;
            case "-" -> result = firstNumber - secondNumber;
            case "*" -> result = firstNumber * secondNumber;
            case "/" -> {
                if (secondNumber == 0) {
                    System.out.println("Can't divide by zero!");
                } else {
                    result = firstNumber / secondNumber;
                }
            }
            case "^" -> result = Math.pow(firstNumber, secondNumber);
        }
        System.out.printf("\nResult: %f", result);

        scanner.close();
    }
}
