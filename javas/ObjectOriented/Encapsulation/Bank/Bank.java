package javas.ObjectOriented.Encapsulation.Bank;

public class Bank {
    public static void main(String[] arg){
        BankAccount account1 = new BankAccount("7658398754","Deep Bag",0.00);

        account1.displayAccount();
        account1.withdraw(20);
        account1.deposit(20);
        account1.withdraw(20);
        account1.deposit(200);
        account1.withdraw(40);
        account1.deposit(2000);
        account1.deposit(2000);
    }
}
