package javas.Core.Generics;

// T must be a subclass of Number
class Calculator<T extends Number> {
    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.square(4)); // 16.0

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.square(2.5)); // 6.25
    }
}
