package javas.AccessModifires;

// Visibility: Accessible within the same package and by subclasses (including subclasses in other packages).
// Usage: Used when you want a class, method, or variable to be accessible to other classes in the same package or to subclasses.

public class Protected {
    protected int value;

    protected void display() {
        System.out.println("Hello from protected method");
    }
}
