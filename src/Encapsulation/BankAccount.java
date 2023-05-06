package Encapsulation;


public class BankAccount {
    private double balance;         // Only accessed by Class methods and by objects directly
    protected String accountNumber;

    public BankAccount(double initialBalance , String accountNumber){
        this.balance = initialBalance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){

        this.balance = this.balance+amount;
    }

    public void withdraw(double amount){
        if(amount<=this.balance){
            this.balance = this.balance - amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }

    public void transfer(double amount, BankAccount destination){  // Passing the Same class object as parameter
        if(amount<=balance){
            withdraw(amount);
            destination.deposit(amount);
        }
        else {
            System.out.println("Insufficient Balance");
        }

    }

    public double getBalance(){

        return this.balance;
    }

}
