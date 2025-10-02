import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.*;

public class ConcurrentDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        // 1. ExecutorService with Callable + Future
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            Thread.sleep(500);
            return 42;
        };

        Future<Integer> result = executor.submit(task);
        System.out.println("Future result: " + result.get());

        // 2. AtomicInteger (lock-free counter)
        AtomicInteger counter = new AtomicInteger(0);
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) counter.incrementAndGet();
        };
        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Atomic counter = " + counter.get());

        // 3. ConcurrentHashMap
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("apples", 5);
        map.compute("apples", (k, v) -> v + 1);
        System.out.println("ConcurrentHashMap: " + map);

        executor.shutdown();
    }
}
