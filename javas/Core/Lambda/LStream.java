package javas.Core.Lambda;
import java.util.List;

public class LStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .filter(n -> n % 2 == 0)  // keep even numbers
                .forEach(n -> System.out.println("Even: " + n));
    }
}
