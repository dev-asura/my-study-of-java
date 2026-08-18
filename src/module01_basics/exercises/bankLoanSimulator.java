package module01_basics.exercises;
import java.util.Scanner;

public class bankLoanSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        double monthlyGrossIncome;
        double desiredValue;
        String tarnishedName;
        double maxInstallment;

        System.out.print("What's your age: ");
        age = scanner.nextInt();
        System.out.print("How much is your monthly gross income: ");
        monthlyGrossIncome = scanner.nextDouble();
        System.out.print("The desired installment amount: ");
        desiredValue = scanner.nextDouble();
        System.out.print("Are your name tarnished or restricted (Yes/No): ");
        tarnishedName = scanner.next();

        if(age < 18 || age > 65 ){
            System.out.println("Sorry, but we don't have any offers to you.");
        } else {
            if(tarnishedName.equalsIgnoreCase("Yes") || tarnishedName.equalsIgnoreCase("Y")){
                System.out.println("Sorry, but we don't have any offers to you.");
            } else {
                maxInstallment = monthlyGrossIncome * 0.3;
                if(desiredValue <= maxInstallment){
                    System.out.println("After checking our system, I can verify that this offer is available for you.\n Your request has been approved!");
                } else {
                    System.out.println("Sorry, but we don't have any offers to you.");
                }
            }
        }
        scanner.close();
    }
}
