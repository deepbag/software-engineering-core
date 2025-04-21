package javas.ObjectOriented.Abstraction.PaymentsInterface;

public class PayPalPayment implements Payment {
    public void processPayment(){
        System.out.println("Processing PayPal payment.");
    }
}
