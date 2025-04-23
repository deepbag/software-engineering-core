package javas.Core.CollectionsFramework;
import java.util.Set;
import java.util.HashSet;

public class SetHashSetCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");  // Duplicate is not allowed
        System.out.println("Set: " + set);
    }
}
