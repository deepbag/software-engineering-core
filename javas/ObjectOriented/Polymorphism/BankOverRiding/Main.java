package javas.ObjectOriented.Polymorphism.BankOverRiding;

public class Main {
    public static void main(String[] arg){
        Bank bank = new Bank();
        bank.getInterestRate();

        SBI sbi = new SBI();
        sbi.getInterestRate();

        ICICI icici = new ICICI();
        icici.getInterestRate();


    }
}
