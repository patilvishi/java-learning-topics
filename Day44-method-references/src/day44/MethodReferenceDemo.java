package day44;

import java.util.*;
import java.util.function.*;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names = List.of("Java", "Streams", "Lambda");

        // 1️.Lambda
        names.forEach(n -> System.out.println(n));

        // 2️.Method Reference (Cleaner)
        names.forEach(System.out::println);

        // 3️.Static Method Reference
        Function<String, Integer> parser = Integer::parseInt;
        System.out.println("Parsed: " + parser.apply("100"));

        // 4️.Instance Method Reference
        Function<String, String> upper = String::toUpperCase;
        System.out.println(upper.apply("java"));

        // 5️.Constructor Reference
        Supplier<List<String>> listSupplier = ArrayList::new;
        List<String> list = listSupplier.get();

        list.add("Constructor Reference");
        System.out.println(list);
    }
}