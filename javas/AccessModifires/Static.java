package javas.AccessModifires;

//static is used to create class-level variables and methods. This means the variable or method is shared among all instances of the class, and can be accessed without creating an instance of the class.
//Static Variable: Shared among all instances of the class.
//Static Method: Can be called without an instance of the class.

// Static Variable:
class Counter {
    static int count = 0; // Static variable shared by all instances

    Counter() {
        count++;
    }

    void displayCount() {
        System.out.println("Count: " + count);
    }
}

// Static Method:
class MathUtility {
    static int add(int a, int b) {
        return a + b;
    }
}

public class Static {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.displayCount(); // Output: Count: 2
        c2.displayCount(); // Output: Count: 2

        int result = MathUtility.add(5, 10); // Static method can be called without an object
        System.out.println("Result: " + result); // Output: Result: 15
    }
}
