import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        long[] numbers = new long[20];
        for (int i = 0; i < numbers.length; i++) numbers[i] = i + 1;

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(numbers, 0, numbers.length);

        long result = pool.invoke(task);

        System.out.println("Final Sum = " + result);
        pool.shutdown();
    }
}
