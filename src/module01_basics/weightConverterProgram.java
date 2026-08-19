package module01_basics;
import java.util.Scanner;

public class weightConverterProgram {
    public static void main(String[] args) {

        // Weight Converter Program

        Scanner scanner = new Scanner(System.in);

        double userWeight;
        double convertedWeight;
        int userChoice;

        System.out.println("Welcome! This program is a Weight Converter.");
        System.out.println("You want to convert:\n 01 - LBS to KGS \n 02 - KGS to LBS");
        System.out.print("Choose and option: ");
        userChoice = scanner.nextInt();

        if(userChoice == 1 || userChoice == 01){
            System.out.println("Enter the weight (in LBS): ");
            userWeight = scanner.nextDouble();
            convertedWeight = userWeight / 2.20462;
            System.out.printf("\n%.2f lbs in kgs is: %.2f ", userWeight, convertedWeight);
        } else if (userChoice == 2 || userChoice == 02) {
            System.out.println("Enter the weight (in KGS): ");
            userWeight = scanner.nextDouble();
            convertedWeight = userWeight * 2.20462;
            System.out.printf("\n%.2f kgs in lbs is: %.2f ", userWeight, convertedWeight);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
