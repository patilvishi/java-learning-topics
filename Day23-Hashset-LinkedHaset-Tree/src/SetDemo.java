import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        List<String> names = Arrays.asList("Bob", "Alice", "Charlie", "Alice");

        // Add all elements
        hashSet.addAll(names);
        linkedHashSet.addAll(names);
        treeSet.addAll(names);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
