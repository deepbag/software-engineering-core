package javas.Core.CollectionsFramework;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
