package javas.Core.ExceptionHandling;

public class ExceptionGenericHandle {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
