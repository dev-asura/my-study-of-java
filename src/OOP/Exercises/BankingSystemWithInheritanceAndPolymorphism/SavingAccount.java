package OOP.Exercises.BankingSystemWithInheritanceAndPolymorphism;

public class SavingAccount extends Account{
    private double interestRate;

    SavingAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double applyInterest(){
        return balance += balance * interestRate;
    }
}
