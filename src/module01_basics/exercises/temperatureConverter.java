package module01_basics.exercises;
import java.util.Scanner;
public class temperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String option;

        do {
            System.out.println("Temperature Converter");
            System.out.println("\n01 - Celsius to Fahrenheit");
            System.out.println("02 - Fahrenheit to Celsius");
            System.out.print("\nChoose an option (01 / 02): ");
            option = scanner.nextLine().trim();
        } while(!option.equals("01") && !option.equals("02") && !option.equals("1") && !option.equals("2"));

        System.out.println(option);
            if (option.equals("01") || option.equals("1")) {
                System.out.print("Enter the temperature in Celsius: ");
                double temperature = scanner.nextDouble();
                double converted = temperature * (9.0 / 5.0) + 32.0;
                System.out.printf("\n%.2f °C -> %.2f °F.", temperature, converted);
            } else if (option.equals("02") || option.equals("2")) {
                System.out.println("Enter the temperature in Fahrenheit: ");
                double temperature = scanner.nextDouble();
                double converted = (temperature - 32.0) * (5.0 / 9.0);
                System.out.printf("\n%.2f °F -> %.2f °C.", temperature, converted);
            } else {
                System.out.println("Enter a valid option: ");
            }

        scanner.close();
    }
}