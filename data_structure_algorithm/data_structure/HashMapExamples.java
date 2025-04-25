package data_structure_algorithm.data_structure;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] arg){
        // Create a HashMap
        Map<String, String> empCodes = new HashMap<>();

        // Add Entries (empCode → name)
        empCodes.put("E101", "Alice");
        empCodes.put("E102", "Bob");
        empCodes.put("E103", "Charlie");

        // Print the Map
        System.out.println(empCodes); // Output: {E101=Alice, E102=Bob, E103=Charlie}

        // Access Value by Key
        String name = empCodes.get("E102");
        System.out.println(name); // Bob

        // Check if Key or Value Exists
        System.out.println(empCodes.containsKey("E101"));  // true
        System.out.println(empCodes.containsValue("Alice")); // true

        // Remove an Entry
        empCodes.remove("E103");
        System.out.println(empCodes); // {E101=Alice, E102=Bob}

        // Iterate Over Entries
        for (String code : empCodes.keySet()) {
            System.out.println(code + " -> " + empCodes.get(code));
        }

        // Size of Map
        System.out.println(empCodes.size()); // 2

        // Use Custom Types
        HashMap<Integer, Employee> empMap = new HashMap<>();
    }
}
