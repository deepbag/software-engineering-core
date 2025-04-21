package javas.ObjectOriented.Abstraction.PaymentsInterface;

public class Main {
    public static void main(String[] arg){
        CreditCardPayment ccp = new CreditCardPayment();
        ccp.processPayment();

        PayPalPayment ppp = new PayPalPayment();
        ppp.processPayment();
    }
}
