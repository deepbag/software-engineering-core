package javas.Core.ExceptionHandling;

public class ClassCastExceptionHandle {
    public static void main(String[] args) {
        try {
            Object x = new Integer(100);
            String s = (String) x;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }
    }
}
