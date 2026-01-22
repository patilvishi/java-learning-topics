package day41;

import java.util.*;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorDemo {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6,7,8);

        Spliterator<Integer> spliterator = numbers.spliterator();

        System.out.println("Characteristics: " +
                spliterator.characteristics());

        // 1️ trySplit()
        Spliterator<Integer> split1 = spliterator.trySplit();

        System.out.println("\nFirst Split:");
        split1.forEachRemaining(System.out::println);

        System.out.println("\nRemaining Elements:");
        spliterator.forEachRemaining(System.out::println);
    }
}
