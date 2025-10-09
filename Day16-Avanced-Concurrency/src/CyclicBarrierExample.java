import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3,
            () -> System.out.println("All threads reached barrier!"));

        for (int i = 1; i <= 3; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " working...");
                    Thread.sleep(1000);
                    barrier.await();
                    System.out.println(Thread.currentThread().getName() + " passed barrier");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
