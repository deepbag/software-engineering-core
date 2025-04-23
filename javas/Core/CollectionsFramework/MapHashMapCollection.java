package javas.Core.CollectionsFramework;
import java.util.Map;
import java.util.HashMap;

public class MapHashMapCollection {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Orange", 2);
        System.out.println("Map: " + map);
        System.out.println("Value for Apple: " + map.get("Apple"));
    }
}
