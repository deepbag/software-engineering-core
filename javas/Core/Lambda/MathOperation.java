package javas.Core.Lambda;

interface IMathOperation {
    int operate(int a, int b);
}

public class MathOperation {
    public static void main(String[] args) {
        IMathOperation add = (a, b) -> a + b;
        IMathOperation multiply = (a, b) -> a * b;

        System.out.println("Add: " + add.operate(5, 3));
        System.out.println("Multiply: " + multiply.operate(5, 3));
    }
}
