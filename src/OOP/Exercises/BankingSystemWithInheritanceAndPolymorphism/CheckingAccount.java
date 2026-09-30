package OOP.Exercises.BankingSystemWithInheritanceAndPolymorphism;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    CheckingAccount(String accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount){
        if(balance + overdraftLimit < amount){
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }
}
