package javas.Core.Generics;

public class GenericMethod {
    // A generic method to print any type of array
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"A", "B", "C"};

        printArray(intArr); // Works for Integer[]
        printArray(strArr); // Works for String[]
    }
}
