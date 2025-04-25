package data_structure_algorithm.data_structure;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDynamicExamples {
   public static void main(String[] arg){
       // Creating an ArrayList
       ArrayList<String> fruits = new ArrayList<>();

       // Adding Elements
       fruits.add("Apple");
       fruits.add("Banana");
       fruits.add("Mango");

       // Accessing Elements
       System.out.println(fruits.get(1)); // Banana

       // Changing Elements
       fruits.set(1, "Orange");
       System.out.println(fruits); // [Apple, Orange, Mango]

       // Removing Elements
       fruits.remove(1); // removes "Orange"
       System.out.println(fruits); // [Apple, Mango]

       // ArrayList Size
       System.out.println(fruits.size()); // 2

       // Looping Through an ArrayList
       for (String fruit : fruits) {
           System.out.println(fruit);
       }

       // Check if List Contains an Element
       if (fruits.contains("Mango")) {
           System.out.println("Mango is in the list!");
       }

       // Sorting ArrayList
       ArrayList<Integer> numbers = new ArrayList<>();
       numbers.add(3);
       numbers.add(1);
       numbers.add(2);

       Collections.sort(numbers); // Ascending order
       System.out.println(numbers); // [1, 2, 3]

       // Clear All Elements
       fruits.clear();
       System.out.println(fruits); // []
   }
}
