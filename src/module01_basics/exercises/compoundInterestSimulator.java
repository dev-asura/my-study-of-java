package module01_basics.exercises;
import java.util.Scanner;

public class compoundInterestSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialCapital;
        double finalCapital;
        int time;
        double interestRate;

        System.out.println("COMPOUND INTEREST SIMULATOR");
        System.out.println("***************************");
        System.out.print("Enter your initial capital: ");

        while(true){
            if(!scanner.hasNextDouble()){
                System.out.print("Enter a valid capital: ");
                scanner.next();
                continue;
            }
            initialCapital = scanner.nextDouble();

            if(initialCapital < 0) {
                System.out.print("Enter a valid capital: ");
            } else {
                break;
            }
        }

        System.out.print("For how long (in years) will you invest your money: ");
        while(true){
            if(!scanner.hasNextInt()){
                System.out.print("Enter a valid time: ");
                scanner.next();
                continue;
            }
            time = scanner.nextInt();

            if(time < 0) {
                System.out.print("Enter a valid time: ");
            } else {
                break;
            }
        }

        System.out.print("What is the current annual interest rate: ");
        while(true){
            if(!scanner.hasNextDouble()){
                System.out.print("Enter a valid number: ");
                scanner.next();
                continue;
            }
            interestRate = scanner.nextDouble();

            if(interestRate < 0) {
                System.out.print("Enter a valid number: ");
            } else {
                break;
            }
        }
        finalCapital = initialCapital * Math.pow( 1 + interestRate/100, time);

        System.out.println("***************************");
        System.out.printf("If you save $%.2f today, in %d year/s you gonna have: $%.2f", initialCapital, time, finalCapital);
        scanner.close();
    }
}

