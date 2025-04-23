package javas.Core.Generics;

// A generic class with type parameter T
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Box of String
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println(stringBox.getValue());

        // Box of Integer
        Box<Integer> intBox = new Box<>();
        intBox.setValue(42);
        System.out.println(intBox.getValue());
    }
}
