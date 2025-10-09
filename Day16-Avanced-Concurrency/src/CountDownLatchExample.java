import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " finished work");
                latch.countDown();
            }).start();
        }

        latch.await();
        System.out.println("All workers finished. Proceeding!");
    }
}
