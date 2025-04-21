package javas.ObjectOriented.Polymorphism.BankOverRiding;

public class ICICI extends Bank {
    @Override
    void getInterestRate(){
        System.out.println("Interest rate: 6%");
    }
}
