package javas.Core.StreamAPI;
import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Deep", "Amit", "Rahul", "Sneha");

        names.stream()
                .filter(name -> name.startsWith("D"))
                .forEach(value->System.out.println("ForEach: "+value)); // Output: Deep
    }
}
