package day43;

import java.util.function.*;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        // 1️ Predicate<T>
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // 2️ Function<T, R>
        Function<String, Integer> lengthFn = s -> s.length();
        System.out.println("Length of 'Java': " + lengthFn.apply("Java"));

        // 3️ Consumer<T>
        Consumer<String> printer = s -> System.out.println("Value: " + s);
        printer.accept("Lambda");

        // 4️ Supplier<T>
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random value: " + randomSupplier.get());

        // 5️ Custom Functional Interface
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.calculate(10, 20));
    }

    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }
}
