package javas.Core.Lambda;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        names.forEach(name -> System.out.println("Hi " + name));
    }
}
