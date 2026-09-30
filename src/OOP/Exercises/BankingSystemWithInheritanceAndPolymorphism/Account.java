package OOP.Exercises.BankingSystemWithInheritanceAndPolymorphism;

public class Account {
    protected String accountNumber;
    protected double balance;

    Account(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount){
        if(balance < amount){
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    @Override
    public String toString(){
        return "Account Number: " + accountNumber + " | Balance: $" + balance;
    }
}
