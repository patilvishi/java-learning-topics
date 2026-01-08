package day38;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamsDemo {

    public static void main(String[] args) {

        // 1️ Sequential Stream
        long startSeq = System.currentTimeMillis();
        long sumSeq = IntStream.rangeClosed(1, 10_000_000)
                .filter(n -> n % 2 == 0)
                .sum();
        long endSeq = System.currentTimeMillis();

        System.out.println("Sequential Sum: " + sumSeq);
        System.out.println("Sequential Time: " + (endSeq - startSeq) + " ms");

        // 2️ Parallel Stream
        long startPar = System.currentTimeMillis();
        long sumPar = IntStream.rangeClosed(1, 10_000_000)
                .parallel()
                .filter(n -> n % 2 == 0)
                .sum();
        long endPar = System.currentTimeMillis();

        System.out.println("\nParallel Sum: " + sumPar);
        System.out.println("Parallel Time: " + (endPar - startPar) + " ms");

        // 3️ Thread usage demo
        List<String> names = List.of("A", "B", "C", "D", "E");

        System.out.println("\nThreads used by parallel stream:");
        names.parallelStream()
                .forEach(n ->
                        System.out.println(
                                n + " processed by " +
                                Thread.currentThread().getName()
                        )
                );
    }
}
