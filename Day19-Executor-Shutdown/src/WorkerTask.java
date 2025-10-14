public class WorkerTask implements Runnable {
    private final int id;

    public WorkerTask(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting task " + id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Task " + id + " interrupted!");
        }
        System.out.println(Thread.currentThread().getName() + " completed task " + id);
    }
}
