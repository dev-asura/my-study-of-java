package module01_basics.exercises;
import java.util.Scanner;
public class aBMICalculatorWithHealthyWeightRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double height;
        double BMI;
        double minHealthyWeight;
        double maxHealthWeight;

        System.out.print("Enter your Weight (in kgs): ");
        weight = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        height = scanner.nextDouble();
        BMI = weight / Math.pow(height, 2);

        if(BMI < 18.5){
            System.out.println("\nYou are underweight.");
            System.out.printf("\nYour BMI: %.2f", BMI);
        } else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("\nYou are at your ideal weight.");
            System.out.printf("\nYour BMI: %.2f", BMI);
        } else if(BMI >= 25 && BMI <= 29.9){
            System.out.println("\nYou are overweight.");
            System.out.printf("\nYour BMI: %.2f", BMI);
        } else if (BMI >= 30){
            if(BMI >= 35){
                System.out.println("\nYou have severity obesity.");
                System.out.printf("\nYour BMI: %.2f", BMI);;
            } else {
                System.out.println("\nYou are obese.");
                System.out.printf("\nYour BMI: %.2f", BMI);
            }
        }

        minHealthyWeight = Math.pow(height, 2) * 18.5;
        maxHealthWeight = Math.pow(height, 2) * 24.9;

        System.out.println("\nYour minimal healthy weight is: " + Math.round(minHealthyWeight));
        System.out.println("Your maximal healthy weight is: " + Math.round(maxHealthWeight));

        scanner.close();
    }
}
