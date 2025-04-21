package javas.ObjectOriented.Polymorphism.CalculatorOverloading;

public class Calculator {
    void add(int a, int b){
        System.out.println("Sum of integers: "+(a+b));
    }

    void add(double a, double b){
        System.out.println("Sum of doubles: "+(a+b));
    }

    void add(String a, String b){
        System.out.println("Sum of doubles: "+(a+b));
    }
}
