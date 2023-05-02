import Encapsulation.BankAccount;
import Encapsulation.SavingAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount(1000.0,"123456789");
        double balance = person1.getBalance();
        // person1.balance = 100; // Private Attribute cannot be accessed by the object directly
        BankAccount acc1 = new BankAccount(1000.0,"123");
        BankAccount acc2 = new BankAccount(500.0,"567");
        System.out.println("Balance in acc1 : " + acc1.getBalance());
        System.out.println("Balance in acc2 : " + acc2.getBalance());

        acc1.transfer(200,acc2);
        System.out.println("Transfer from acc1 to acc2" );
        System.out.println("Balance in acc1 after Transfer1 : " + acc1.getBalance());
        System.out.println("Balance in acc2 after Transfer2 : " + acc2.getBalance());


        System.out.println("----------Subclass Implementation-----------");
        SavingAccount RK = new SavingAccount(1000,"1234",0.05);
        RK.accureInterest();
        System.out.println(RK.getBalance());
        RK.transfer(50,acc1);
        System.out.println(acc1.getBalance());
    }
}



