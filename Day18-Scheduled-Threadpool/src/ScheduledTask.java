public class ScheduledTask implements Runnable {
    private final String taskName;

    public ScheduledTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " executing task: " + taskName 
            + " at " + java.time.LocalTime.now());
    }
}
