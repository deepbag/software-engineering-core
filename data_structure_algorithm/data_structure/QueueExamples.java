package data_structure_algorithm.data_structure;
import java.util.Queue;
import java.util.LinkedList;

public class QueueExamples {
    public static void main(String[] arg){
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Adding Elements (enqueue)
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");
        System.out.println(queue); // [Apple, Banana, Mango]

        // Removing Elements (dequeue)
        String item = queue.remove();
        System.out.println(item);  // Apple
        System.out.println(queue); // [Banana, Mango]

        // Peek Front Element
        String head = queue.peek();  // Banana
        System.out.println(head);

        // Checking if Queue is Empty
        System.out.println(queue.isEmpty()); // false

        // Getting Queue Size
        System.out.println(queue.size()); // 2

        // Iterating a Queue
        for (String fruit : queue) {
            System.out.println(fruit);
        }
    }
}
