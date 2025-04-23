package javas.Core.CollectionsFramework;
import java.util.Collection;
import java.util.ArrayList;
//import java.util.List;

public class ListArrayListCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
//        ArrayList<String> collection = new ArrayList<>();
//        List<String> collection = new ArrayList<>();

        collection.add("Apple");
        collection.add("Banana");
        collection.add("Orange");
        System.out.println("Collection: " + collection);
    }
}
