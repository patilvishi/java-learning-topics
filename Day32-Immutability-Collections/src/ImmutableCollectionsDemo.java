package day32;

import java.util.*;

public class ImmutableCollectionsDemo {

    public static void main(String[] args) {

        // 1️ Using Collections.unmodifiableXXX()
        List<String> mutableList = new ArrayList<>();
        mutableList.add("A");
        mutableList.add("B");

        List<String> unmodifiableList =
                Collections.unmodifiableList(mutableList);

        System.out.println("Unmodifiable List: " + unmodifiableList);

        // ❌ Throws UnsupportedOperationException
        // unmodifiableList.add("C");

        // But original list modification is reflected
        mutableList.add("C");
        System.out.println("After modifying original list: " + unmodifiableList);

        // 2️ Java 9+ Immutable Collections
        List<String> immutableList = List.of("X", "Y", "Z");
        Set<Integer> immutableSet = Set.of(1, 2, 3);
        Map<String, Integer> immutableMap = Map.of("A", 1, "B", 2);

        System.out.println("Immutable List: " + immutableList);
        System.out.println("Immutable Set: " + immutableSet);
        System.out.println("Immutable Map: " + immutableMap);

        // ❌ All throw UnsupportedOperationException
        // immutableList.add("P");
        // immutableSet.remove(1);
        // immutableMap.put("C", 3);
    }
}
