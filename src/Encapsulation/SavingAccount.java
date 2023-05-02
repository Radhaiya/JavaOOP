package Encapsulation;

public class SavingAccount extends BankAccount {
    private final double interestRate;
    public SavingAccount(double initialBalance, String accountNumber,double interestRate) {
        super(initialBalance, accountNumber);
        this.interestRate = interestRate;
    }

    public void accureInterest(){
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
}
