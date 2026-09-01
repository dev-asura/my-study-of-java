package module01_basics.exercises;
import java.util.Scanner;

public class loanEligibilityValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        double monthlyIncome;
        int creditScore;
        System.out.println("******************************");
        System.out.println("* Loan Eligibility Validator *");
        System.out.println("******************************");

        System.out.print("Enter your age: ");

        while(true){
            if(!scanner.hasNextInt()){
                System.out.print("Enter a valid age: ");
                scanner.next();
                continue;
            }
            age = scanner.nextInt();
            if(age < 0 || age > 120){
                System.out.print("Enter a valid age: ");
            }else{
                break;
            }
        }

        System.out.print("Enter your monthly income: ");

        while(true){
            if(!scanner.hasNextDouble()){
                System.out.print("Enter a valid monthly income: ");
                scanner.next();
                continue;
            }
            monthlyIncome = scanner.nextDouble();
            if(monthlyIncome < 0){
                System.out.print("Enter a valid monthly income: ");
            }else{
                break;
            }
        }

        System.out.print("Enter your credit score (0 - 1000): ");

        while(true){
            if(!scanner.hasNextInt()){
                System.out.print("Enter a valid credit score: ");
                scanner.next();
                continue;
            }
            creditScore = scanner.nextInt();
            if(creditScore < 0 || creditScore > 1000){
                System.out.print("Enter a valid credit score: ");
            }else{
                break;
            }
        }

        if(age >= 18){
            if(monthlyIncome > 3000){
                if(creditScore >= 700){
                    System.out.println("Full credit approved!");
                }else if(creditScore >= 500 && creditScore <= 699){
                    System.out.println("Partial credit approved!");
                }else{
                    System.out.println("Your score isn't enough! Loan rejected.");
                }
            }else{
                System.out.println("Your monthly income isn't enough! Loan rejected.");
            }
        }else{
            System.out.println("You need to be an adult. Loan rejected.");
        }
        scanner.close();
    }
}
