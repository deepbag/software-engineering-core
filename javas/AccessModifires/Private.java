package javas.AccessModifires;

//Visibility: Accessible only within the same class.
//Usage: Used to restrict access to the class members (variables and methods) to the same class only. This is useful for data encapsulation and security.

public class Private {
    private int value;

    private void display() {
        System.out.println("Private method");
    }
}
