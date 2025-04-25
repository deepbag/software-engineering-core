package data_structure_algorithm.data_structure;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of strings
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements to the LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange"); // Add at the beginning
        fruits.addLast("Grapes");  // Add at the end

        // Display the LinkedList
        System.out.println("Fruits LinkedList: " + fruits);

        // Access elements
        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());

        // Remove elements
        fruits.remove("Banana");
        fruits.removeFirst(); // Removes "Orange"
        fruits.removeLast();  // Removes "Grapes"

        // Display after removal
        System.out.println("After removal: " + fruits);

        // Iterate through the list
        System.out.println("Iterating through list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
