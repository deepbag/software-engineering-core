package data_structure_algorithm.data_structure;

import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] arg){
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // Add Elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate, will be ignored

        System.out.println(fruits); // [Apple, Banana, Mango] (order may vary)

        // Check if Set Contains an Element
        System.out.println(fruits.contains("Banana")); // true
        System.out.println(fruits.contains("Orange")); // false

        // Remove an Element
        fruits.remove("Banana");
        System.out.println(fruits); // [Apple, Mango]

        // Loop Through HashSet
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of HashSet
        System.out.println(fruits.size()); // 2

        // Check if Set is Empty
        System.out.println(fruits.isEmpty()); // false
    }
}
