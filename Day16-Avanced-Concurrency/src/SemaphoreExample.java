import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    private static final Semaphore semaphore = new Semaphore(2);

    static class Worker extends Thread {
        private final String name;

        Worker(String name) { this.name = name; }

        public void run() {
            try {
                System.out.println(name + " waiting...");
                semaphore.acquire();
                System.out.println(name + " working...");
                Thread.sleep(1000);
                System.out.println(name + " done!");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semaphore.release();
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            new Worker("Worker-" + i).start();
        }
    }
}
