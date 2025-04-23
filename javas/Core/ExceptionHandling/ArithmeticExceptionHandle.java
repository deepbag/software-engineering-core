package javas.Core.ExceptionHandling;

public class ArithmeticExceptionHandle {
    public static void main(String[] args) {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
    }
}
