import java.util.concurrent.*;

public class SchedulerDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        System.out.println("Scheduling tasks... " + java.time.LocalTime.now());

        scheduler.schedule(new ScheduledTask("One-time Task"), 3, TimeUnit.SECONDS);

        scheduler.scheduleAtFixedRate(
                new ScheduledTask("Fixed Rate Task"),
                2,
                4,
                TimeUnit.SECONDS);

        scheduler.scheduleWithFixedDelay(
                new ScheduledTask("Fixed Delay Task"),
                1,
                5,
                TimeUnit.SECONDS);

        // Let tasks run for a while before shutting down
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
        System.out.println("Scheduler shutdown initiated at " + java.time.LocalTime.now());
    }
}
