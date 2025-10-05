import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class StreamFutureDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        ExecutorService executor = Executors.newFixedThreadPool(4);

        long start = System.currentTimeMillis();

        // Sequential processing
        List<Integer> squaresSequential = numbers.stream()
                .map(n -> square(n))
                .toList();

        // Parallel Stream
        List<Integer> squaresParallel = numbers.parallelStream()
                .map(StreamFutureDemo::square)
                .toList();

        // CompletableFuture-based parallel async pipeline
        List<CompletableFuture<Integer>> futures = numbers.stream()
                .map(n -> CompletableFuture.supplyAsync(() -> square(n), executor))
                .toList();

        List<Integer> asyncResults = futures.stream()
                .map(CompletableFuture::join)
                .toList();

        executor.shutdown();

        long end = System.currentTimeMillis();

        System.out.println("Sequential: " + squaresSequential);
        System.out.println("Parallel Stream: " + squaresParallel);
        System.out.println("CompletableFuture Async: " + asyncResults);
        System.out.println("Total Time: " + (end - start) + "ms");
    }

    private static int square(int n) {
        try {
            Thread.sleep(500); // simulate work
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return n * n;
    }
}
