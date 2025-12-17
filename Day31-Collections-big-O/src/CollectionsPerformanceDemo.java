package day31;

import java.util.*;

public class CollectionsPerformanceDemo {
    public static void main(String[] args) {

        // List performance
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Add elements
        for (int i = 0; i < 1_000_0; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Access
        System.out.println("ArrayList get(5000): " + arrayList.get(5000));
        System.out.println("LinkedList get(5000): " + linkedList.get(5000));

        // Map performance
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(1, "A");
        treeMap.put(1, "A");

        System.out.println("HashMap get: " + hashMap.get(1));
        System.out.println("TreeMap get: " + treeMap.get(1));
    }
}
