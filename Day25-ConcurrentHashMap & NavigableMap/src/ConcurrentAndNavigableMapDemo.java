// Day 25 - ConcurrentHashMap & NavigableMap Example

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentAndNavigableMapDemo {

    public static void main(String[] args) {

        // 1️⃣ ConcurrentHashMap Example
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("A", 1);
        concurrentMap.put("B", 2);
        concurrentMap.put("C", 3);

        System.out.println("ConcurrentHashMap Initial: " + concurrentMap);

        // Simulate concurrent updates
        Runnable writer = () -> {
            for (int i = 4; i <= 6; i++) {
                concurrentMap.put("T" + i, i);
                System.out.println(Thread.currentThread().getName() + " added T" + i);
            }
        };

        Thread t1 = new Thread(writer, "Writer-1");
        Thread t2 = new Thread(writer, "Writer-2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("ConcurrentHashMap After Threads: " + concurrentMap);

        // 2️⃣ NavigableMap Example (TreeMap)
        NavigableMap<Integer, String> navMap = new TreeMap<>();
        navMap.put(100, "A");
        navMap.put(200, "B");
        navMap.put(300, "C");
        navMap.put(400, "D");

        System.out.println("\nNavigableMap: " + navMap);
        System.out.println("Lower Entry (before 300): " + navMap.lowerEntry(300));
        System.out.println("Higher Entry (after 300): " + navMap.higherEntry(300));
        System.out.println("Floor Entry (<=300): " + navMap.floorEntry(300));
        System.out.println("Ceiling Entry (>=250): " + navMap.ceilingEntry(250));
        System.out.println("Descending Map: " + navMap.descendingMap());
    }
}
