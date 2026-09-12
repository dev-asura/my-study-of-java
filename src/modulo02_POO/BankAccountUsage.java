package modulo02_POO;

public class BankAccountUsage {
    public static void main(String[] args){

        BankAccount bankAccount1 = new BankAccount("01-0003", "Thiago Lucas");
        BankAccount bankAccount2 = new BankAccount("01-0003", "Thiago Lucas", 300);

        bankAccount1.deposit(100.00);
        bankAccount1.deposit(230.50);
        bankAccount1.withdraw(200);
        bankAccount1.deposit(320.33);
        bankAccount1.withdraw(350.83);

        System.out.println();
        System.out.println("Bank Account 02 balance: " + bankAccount2.balance);
        bankAccount2.deposit(3000.99);
        bankAccount2.withdraw(2300.99);
    }
}
