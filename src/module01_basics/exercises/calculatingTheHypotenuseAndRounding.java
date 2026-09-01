package module01_basics.exercises;
import java.util.Scanner;

public class calculatingTheHypotenuseAndRounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double aLeg;
        double bLeg;
        double hypo;

        System.out.println("Hypotenuse Calculator");
        System.out.println("*********************");
        System.out.print("Enter the value of the Leg A: ");
        while(true) {
            if(!scanner.hasNextDouble()){
                System.out.print("Enter a valid value for A leg (> 0): ");
                scanner.next();
                continue;
            }
            aLeg = scanner.nextDouble();
            if(aLeg <= 0){
                System.out.print("Enter a valid value for A leg (> 0): ");
            } else {
                break;
            }
        }

        System.out.print("Enter the value of the Leg B: ");

        while(true) {
            if(!scanner.hasNextDouble()){
                System.out.print("Enter a valid value for B leg (> 0): ");
                scanner.next();
                continue;
            }
            bLeg = scanner.nextDouble();
            if(bLeg <= 0){
                System.out.print("Enter a valid value for B leg (> 0): ");
            } else {
                break;
            }
        }

        hypo = Math.sqrt(Math.pow(aLeg,2) + Math.pow(bLeg, 2));
        System.out.printf("\nThe hypotenuse is: %.2f", hypo);
        System.out.printf("\nThe round value is: %d", Math.round(hypo));

        scanner.close();
    }
}
