package module01_basics.exercises;
import java.util.Scanner;

public class aBMIClassifierWithTernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double height;
        double weight;
        double bmi;
        String status;

        System.out.println("BMI CLASSIFIER");
        System.out.println("*************************");
        System.out.print("Enter your height (in cm): ");
        while(true){
            if(!scanner.hasNextDouble()){
                System.out.print("Invalid height. Enter your height (in cm): ");
                scanner.next();
                continue;
            }
            height = scanner.nextDouble();
            if(height <= 40) {
                System.out.print("Invalid height. Enter your height (in cm): ");
            } else {
                break;
            }
        }
        System.out.print("Enter your weight (in kg): ");
        while(true){
            if(!scanner.hasNextDouble()){
                System.out.print("Invalid weight. Enter your weight (in kg): ");
                scanner.next();
                continue;
            }
            weight = scanner.nextDouble();
            if(weight <= 9) {
                System.out.print("Invalid weight. Enter your weight (in kg): ");
            } else {
                break;
            }
        }
        System.out.println("*************************");
        bmi = weight/Math.pow(height/100, 2);
        System.out.printf("Your BMI: %.2f\n", bmi);
        System.out.println("*************************");

        status = (bmi > 18.5 && bmi < 25) ? "HEALTHY!" : "WARNING";
        System.out.println(status);

        if(bmi < 18.5){
            System.out.println("Your are UNDERWEIGHT!");
        } else if(bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Your weight is NORMAL.");
        } else if(bmi >= 25 && bmi <= 29.9) {
            System.out.println("You are OVERWEIGHT.");
        } else if(bmi >= 30 && bmi <= 34.9){
            System.out.println("You are OBESITY (1st Class).");
        } else if(bmi >= 35 && bmi <= 39.9) {
            System.out.println("You are OBESITY (2nd Class).");
        } else {
            System.out.println("You are EXTREMELY OBESE.");
        }

        scanner.close();
    }
}
