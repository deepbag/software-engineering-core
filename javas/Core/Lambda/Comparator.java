package javas.Core.Lambda;
import java.util.*;

public class Comparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alex", "Zack");

        // Sort names in reverse order using lambda
        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println(names);
    }
}
