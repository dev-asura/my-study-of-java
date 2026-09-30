package OOP.Exercises.BankingSystemWithInheritanceAndPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Account[] accounts = {
                new Account("14000-14", 12000),
                new SavingAccount("15000-14", 2000, 0.08),
                new CheckingAccount("16000-16", 8000, 1000)
        };

        for(Account account : accounts){
            account.deposit(1000);
            System.out.println(account);
        }

        System.out.println();

        for(Account account : accounts){
            account.withdraw(3100);
            System.out.println(account);
        }

        System.out.println();

        for(Account account : accounts){
            account.withdraw(7100);
            System.out.println(account);
        }
    }
}
