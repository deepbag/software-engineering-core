package javas.Core.Generics;

// A generic interface
interface Processor<T> {
    void process(T item);
}

// Implementation for String type
class StringProcessor implements Processor<String> {
    public void process(String item) {
        System.out.println("Processing: " + item);
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        Processor<String> processor = new StringProcessor();
        processor.process("Generic Interface Example");
    }
}
