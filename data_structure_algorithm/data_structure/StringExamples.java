package data_structure_algorithm.data_structure;

public class StringExamples {
    public static void main(String[] arg){
        // string creation
        String s1 = "Hello"; // using Primitive
        String s2 = String.valueOf("World"); // using String Wrapper Class

        // string concatenation
        String fullName = "John" + " " + "Doe";

        // length
        System.out.println(s1.length()); // 5

        // access characters
        char ch = s1.charAt(1);
        System.out.println(ch); // e

        // Substring
        String sub = s1.substring(0, 2);
        System.out.println(sub); // He

        // String Comparison
        String a = "apple";
        String b = "apple";
        System.out.println(a.equals(b)); // true

        String c = String.valueOf("apple");
        System.out.println(a.equals(c)); // false (different reference)

        // Converting Case
        String text = "Java";
        System.out.println(text.toUpperCase()); // JAVA
        System.out.println(text.toLowerCase()); // java

        // Replace Character
        String original = "I like Java";
        String replaced = original.replace("Java", "Python");
        System.out.println(replaced); // I like Python

        // Splitting Strings
        String data = "apple,banana,orange";
        String[] fruits = data.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
