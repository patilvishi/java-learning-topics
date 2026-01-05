package day36;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // 1️ Creating Optional
        Optional<String> name = Optional.of("Vishwanath");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable = Optional.ofNullable(null);

        // 2️ Checking presence
        if (name.isPresent()) {
            System.out.println("Name is present: " + name.get());
        }

        // 3️ Safer access
        name.ifPresent(n -> System.out.println("Hello " + n));

        // 4️ Default values
        System.out.println("Default name: " + empty.orElse("Guest"));

        // 5️ Lazy default
        System.out.println("Lazy default: " +
                empty.orElseGet(() -> "Generated-User"));

        // 6️ Throw exception if absent
        try {
            empty.orElseThrow(() ->
                    new IllegalArgumentException("Value missing"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 7️ Transform value
        Optional<Integer> length = name.map(String::length);
        System.out.println("Name length: " + length.orElse(0));

        // 8️ Filter
        name.filter(n -> n.startsWith("V"))
            .ifPresent(n -> System.out.println("Starts with V"));
    }
}
