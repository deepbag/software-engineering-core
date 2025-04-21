package javas.ObjectOriented.Polymorphism.CalculatorOverloading;

public class Main {
    public static void main(String[] arg){
        Calculator cl = new Calculator();

        cl.add(15,15);
        cl.add(12.875,12.875);
        cl.add("Hello","World");
    }
}
