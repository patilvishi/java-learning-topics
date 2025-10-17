import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private final long[] numbers;
    private final int start;
    private final int end;
    private static final int THRESHOLD = 5;

    public SumTask(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if (end - start <= THRESHOLD) {
            long sum = 0;
            for (int i = start; i < end; i++) sum += numbers[i];
            System.out.println(Thread.currentThread().getName() + " computed sum for range: " + start + "-" + end);
            return sum;
        }

        int mid = (start + end) / 2;
        SumTask left = new SumTask(numbers, start, mid);
        SumTask right = new SumTask(numbers, mid, end);

        left.fork(); // async
        long rightResult = right.compute(); // compute directly
        long leftResult = left.join(); // wait for left task

        return leftResult + rightResult;
    }
}
