
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorShutdownDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            executor.submit(new WorkerTask(i));
        }

        // Graceful shutdown
        executor.shutdown();
        System.out.println("Shutdown initiated...");

        try {
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Forcing shutdown...");
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            System.out.println("Shutdown interrupted!");
            executor.shutdownNow();
        }

        System.out.println("Executor terminated: " + executor.isTerminated());
    }
}
