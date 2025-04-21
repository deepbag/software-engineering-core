package javas.AccessModifires;

// Visibility: Accessible from any other class.
// Usage: If you declare a class, method, or variable as public, it can be accessed from anywhere, inside or outside the package.

public class Public {
    public int value;

    public void display() {
        System.out.println("Hello");
    }

    public static void main(String[] arg){
        Public pb = new Public();
        System.out.println(pb.value);
        pb.display();
    }
}
