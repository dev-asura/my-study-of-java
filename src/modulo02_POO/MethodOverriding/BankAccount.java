package modulo02_POO.MethodOverriding;

public class BankAccount {

    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(double value){
        this.balance += value;
        System.out.println("Your balance: " + this.balance);
    }

    public void withdraw(double value){
        if(this.balance > 0 && this.balance >= value) {
            this.balance -= value;
            System.out.println("Your balance: " + this.balance);
        } else {
            System.out.println("You don't have money enough to withdraw.");
        }
    }
}
