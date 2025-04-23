package javas.Core.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 2, 1, 4);

        numbers.stream()
                .sorted()
                .forEach(value->System.out.println("ForEach: "+value));
    }
}
