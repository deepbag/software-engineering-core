package data_structure_algorithm.data_structure;

public class StringBuilderExamples {
    public static void main(String[] arg){
        // Creating a StringBuilder
        StringBuilder sb = new StringBuilder();

        // Or with an initial string:
        StringBuilder sbws = new StringBuilder("Hello");

        // Appending Strings
        sb.append(" World");
        System.out.println(sb); // Hello World

        //  Inserting at a Specific Index
        sb.insert(6, "Beautiful ");
        System.out.println(sb); // Hello Beautiful World

        // Replacing Text
        sb.replace(6, 15, "Amazing");
        System.out.println(sb); // Hello Amazing World

        // Deleting Text
        sb.delete(5, 12);
        System.out.println(sb); // Hello World

        // Reversing the String
        sb.reverse();
        System.out.println(sb); // dlroW olleH

        // Convert to String
        String result = sb.toString();
        System.out.println(result); // dlroW olleH

        // StringBuilder Length & Capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // Accessing Character
        System.out.println("2 index Character: "+sb.charAt(2));

        // String Builder
        StringBuilder sbs = new StringBuilder();
        sb.append("Hello");
        sbs.append(" ");
        sbs.append("World");
        System.out.println(sbs.toString()); // Hello World
    }
}
