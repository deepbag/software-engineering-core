package javas.Core.Lambda;

interface IPrinter {
    void print(String message);
}

public class Printer {
    public static void main(String[] args) {
        IPrinter printer = (msg) -> System.out.println("Message: " + msg);
        printer.print("Lambda is cool!");
    }
}
