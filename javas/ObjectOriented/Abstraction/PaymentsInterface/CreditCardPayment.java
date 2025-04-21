package javas.ObjectOriented.Abstraction.PaymentsInterface;

public class CreditCardPayment implements Payment {
    public void processPayment(){
        System.out.println("Processing credit card payment.");
    }
}
