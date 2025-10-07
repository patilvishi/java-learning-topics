import java.util.*;
import java.util.concurrent.*;

public class ConcurrentCollectionsExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        List<String> list = new CopyOnWriteArrayList<>();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable mapTask = () -> {
            for (int i = 0; i < 3; i++) {
                map.put(Thread.currentThread().getName() + "-" + i, i);
            }
        };

        Runnable listTask = () -> {
            for (int i = 0; i < 3; i++) {
                list.add(Thread.currentThread().getName() + "-" + i);
            }
        };

        executor.submit(mapTask);
        executor.submit(listTask);
        executor.shutdown();

        System.out.println("ConcurrentMap: " + map);
        System.out.println("CopyOnWriteArrayList: " + list);
    }
}
