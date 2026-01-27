package day42;

import java.util.*;
import java.util.stream.Stream;

public class StreamVsCollectionDemo {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Vishwanath");
        names.add("Amit");
        names.add("Ravi");

        // Collection: stores data
        System.out.println("Collection size: " + names.size());

        // Stream: processes data
        Stream<String> stream = names.stream();

        System.out.println("\nStream processing:");
        stream
            .filter(n -> n.length() > 4)
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // Stream cannot be reused
        // stream.forEach(System.out::println); // IllegalStateException

        // Collection can be reused
        System.out.println("\nCollection reused:");
        names.forEach(System.out::println);
    }
}
