import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List Example
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // allows duplicates
        System.out.println("List: " + names);

        // Set Example
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Set: " + uniqueNames);

        // Map Example
        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(1, "Alice");
        idToName.put(2, "Bob");
        System.out.println("Map: " + idToName);
    }
}
