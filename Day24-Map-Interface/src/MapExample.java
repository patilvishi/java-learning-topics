// Day 24 - Map Interface Example

import java.util.*;

public class MapExample {
    public static void main(String[] args) {

        // 1 HashMap - Unordered, allows one null key, multiple null values
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Banana", 20);
        hashMap.put("Apple", 40);
        hashMap.put("Mango", 30);
        hashMap.put(null, 100);

        System.out.println("HashMap (Unordered): " + hashMap);

        // 2️ LinkedHashMap - Maintains insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Banana", 20);
        linkedHashMap.put("Apple", 40);
        linkedHashMap.put("Mango", 30);

        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);

        // 3️ TreeMap - Sorted by keys (no null keys allowed)
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Banana", 20);
        treeMap.put("Apple", 40);
        treeMap.put("Mango", 30);

        System.out.println("TreeMap (Sorted by Key): " + treeMap);

        // 4️ Common Operations
        System.out.println("\nContains key 'Apple'? " + hashMap.containsKey("Apple"));
        System.out.println("Value of 'Mango': " + hashMap.get("Mango"));
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());

        // 5️ Iteration
        System.out.println("\nIterating over entries:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
