package javas.SingleTonExample;

public class Main {
    public static void main(String[] args) {
        AdditionSingleton adder1 = AdditionSingleton.getInstance();
        AdditionSingleton adder2 = AdditionSingleton.getInstance();

        System.out.println("Sum: " + adder1.add(10, 20)); // Output: 30
        System.out.println(adder1 == adder2); // Output: true ✅ same object
        // Printing same memory address because initialized once with singleton
        System.out.println(adder1);
        System.out.println(adder2);
    }
}
