import java.util.concurrent.*;

public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {

        // 1. Run async task without returning result
        CompletableFuture<Void> cf1 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 1 running in " + Thread.currentThread().getName());
        });

        // 2. Run async task with result
        CompletableFuture<Integer> cf2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Task 2 calculating...");
            return 21;
        });

        // 3. Chain tasks
        CompletableFuture<Integer> cf3 = cf2.thenApply(x -> x * 2);

        // 4. Combine tasks
        CompletableFuture<Integer> cf4 = cf2.thenCombine(cf3, (a, b) -> a + b);

        // 5. Non-blocking callback
        cf4.thenAccept(result -> 
            System.out.println("Combined Result = " + result)
        );

        // Wait for all tasks
        CompletableFuture.allOf(cf1, cf2, cf3, cf4).join();

        System.out.println("All tasks done!");
    }
}
