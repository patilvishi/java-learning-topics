package day37;

import java.util.List;
import java.util.stream.Stream;

public class StreamsInternalsDemo {

    public static void main(String[] args) {

        List<String> names = List.of("Vishwanath", "Amit", "Ravi", "Suresh");

        // 1️ No terminal operation → nothing executes
        Stream<String> stream = names.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n.startsWith("V");
                })
                .map(n -> {
                    System.out.println("map: " + n);
                    return n.toUpperCase();
                });

        System.out.println("Nothing executed yet!");

        // 2️ Terminal operation triggers execution
        System.out.println("\n--- Terminal operation starts ---");
        stream.forEach(System.out::println);

        // 3️ Short-circuiting example
        System.out.println("\n--- Short-circuiting with findFirst ---");
        names.stream()
                .filter(n -> {
                    System.out.println("filter: " + n);
                    return n.length() > 4;
                })
                .findFirst()
                .ifPresent(System.out::println);
    }
}
