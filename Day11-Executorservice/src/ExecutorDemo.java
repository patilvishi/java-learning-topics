import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        // Fixed thread pool with 4 threads
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Runnable task = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("Running task in " + name);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        // Submit 8 tasks
        for (int i = 0; i < 8; i++) {
            executor.submit(task);
        }

        // Shutdown gracefully
        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks completed!");
    }
}
