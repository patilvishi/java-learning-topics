// Day 26 - Collections Utility Class: Sorting & Searching

import java.util.*;

public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        // 1️⃣ Sorting Example
        List<String> names = new ArrayList<>(Arrays.asList("Vishwanath", "Amit", "Suresh", "Ravi"));
        System.out.println("Original List: " + names);

        Collections.sort(names); // Natural ordering
        System.out.println("Sorted List (Ascending): " + names);

        Collections.sort(names, Collections.reverseOrder()); // Descending
        System.out.println("Sorted List (Descending): " + names);

        // 2️⃣ Binary Search Example
        Collections.sort(names); // Must be sorted before search
        int index = Collections.binarySearch(names, "Ravi");
        System.out.println("Index of 'Ravi': " + index);

        // 3️⃣ Reverse, Shuffle, Min/Max
        Collections.reverse(names);
        System.out.println("Reversed List: " + names);

        Collections.shuffle(names);
        System.out.println("Shuffled List: " + names);

        System.out.println("Min: " + Collections.min(names));
        System.out.println("Max: " + Collections.max(names));

        // 4️⃣ Making Collections Thread-safe
        List<String> syncList = Collections.synchronizedList(new ArrayList<>(names));
        System.out.println("Synchronized List: " + syncList);
    }
}
