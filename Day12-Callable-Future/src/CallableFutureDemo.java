import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task = () -> {
            String thread = Thread.currentThread().getName();
            System.out.println("Calculating in " + thread);
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Doing other work while task runs...");

        // Block until result is ready
        Integer result = future.get();
        System.out.println("Result: " + result);

        executor.shutdown();
    }
}
