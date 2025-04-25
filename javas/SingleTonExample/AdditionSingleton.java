package javas.SingleTonExample;

public class AdditionSingleton {
    // 1. Static variable to hold the single instance
    private static AdditionSingleton instance;

    // 2. Private constructor to prevent direct instantiation
    private AdditionSingleton() {}

    // 3. Public method to return the same instance every time
    public static AdditionSingleton getInstance() {
        if (instance == null) {
            instance = new AdditionSingleton();
        }
        return instance;
    }

    // 4. Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }
}
