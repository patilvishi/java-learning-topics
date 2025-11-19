import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        // 1️ Min-Heap PriorityQueue (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(50);
        minHeap.offer(10);
        minHeap.offer(40);
        minHeap.offer(20);

        System.out.println("Min-Heap PriorityQueue:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        // 2️ Max-Heap PriorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.addAll(List.of(10, 40, 5, 60));

        System.out.println("\n\nMax-Heap PriorityQueue:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
