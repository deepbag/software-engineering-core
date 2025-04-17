package javas.ObjectOriented.Encapsulation.Bank;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(String accountNumber, String accountHolderName, double balance){
        if(accountNumber.length()<10) {
            System.out.println("Account Number Should be greater then 10 digits!");
            return;
        }
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("Account created successfully!");
    }

    public void displayAccount(){
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Name: "+this.accountHolderName);
        System.out.println("Remaining Balance: ₹"+this.balance);
    }

    public void getRemainingBalance(){
        System.out.println("Remaining Balance in: "+this.accountNumber+" -> ₹"+this.balance);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposited in: "+this.accountNumber+" -> ₹"+amount);
        this.getRemainingBalance();
    }

    public void withdraw(double amount){
        if(this.balance<amount) {
            System.out.println("Trying to withdraw ₹"+amount);
            System.out.println("Insufficient Balance!");
        }else{
            this.balance -= amount;
            System.out.println("Withdraw from: "+this.accountNumber+" -> ₹"+amount);
            this.getRemainingBalance();
        }
    }
}
