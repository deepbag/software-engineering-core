package javas.Core.CollectionsFramework;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class SortCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Orange");
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}
