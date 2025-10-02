import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

    // A task that prints a message and sleeps
    static class Worker implements Runnable {
        private final int id;
        Worker(int id) { this.id = id; }

        @Override
        public void run() {
            System.out.println("Task " + id + " running on " +
                               Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        // Using traditional Thread
        Thread t = new Thread(new Worker(0));
        t.start();

        // Using ExecutorService for a pool of threads
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            pool.submit(new Worker(i));
        }

        pool.shutdown();
    }
}
