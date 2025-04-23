package javas.Core.Generics;
import java.util.List;

public class Wildcard {
    // ? means unknown type (wildcard)
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("X", "Y", "Z");

        printList(intList); // Accepts List<Integer>
        printList(strList); // Accepts List<String>
    }
}
