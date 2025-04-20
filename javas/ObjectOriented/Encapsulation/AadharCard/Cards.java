package javas.ObjectOriented.Encapsulation.AadharCard;

public class Cards {

    public static void main(String[] arg){
        AadharCard ac1 = new AadharCard();
        ac1.setName("Deep");
        ac1.setAadharNumber("123456789012");
        ac1.setPhone("9876543210");
        ac1.setAddress("India");
        ac1.setDateOfBirth("01/01/2000");

        String name = ac1.getName();
        System.out.println("Get Name: "+name);
        ac1.display();
    }
}
