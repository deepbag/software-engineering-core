package data_structure_algorithm.data_structure;
import java.util.Stack;

public class StackExamples {
    public static void main(String[] arg){
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing Elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack); // [10, 20, 30]

        // Popping Elements
        int popped = stack.pop();
        System.out.println(popped); // 30
        System.out.println(stack);  // [10, 20]

        // Peek (Top Element Without Removing)
        int top = stack.peek();
        System.out.println(top); // 20

        // Checking if Stack is Empty
        System.out.println(stack.isEmpty()); // false

        // Size of Stack
        System.out.println(stack.size()); // 2

        // Searching for an Element
        System.out.println(stack.search(10)); // 2 (position from top, 1-based)
        System.out.println(stack.search(100)); // -1 (not found)

        // Looping Through Stack
        for (int item : stack) {
            System.out.println(item);
        }

        // Clearing the Stack
        stack.clear();
        System.out.println(stack); // []
    }
}
