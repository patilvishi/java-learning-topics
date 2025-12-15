// Demonstrates weakly-consistent iterators (ConcurrentHashMap)
import java.util.*;
import java.util.concurrent.*;

public class ConcurrentMapIteratorDemo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();
        cmap.put("A", 1);
        cmap.put("B", 2);
        cmap.put("C", 3);

        System.out.println("Initial map: " + cmap);

        Iterator<String> it = cmap.keySet().iterator();

        // Modify map concurrently
        Thread writer = new Thread(() -> {
            cmap.put("D", 4);
            cmap.remove("B");
            System.out.println("Writer thread modified map: " + cmap);
        });

        writer.start();

        // Iterate while concurrent modification happens
        while (it.hasNext()) {
            String k = it.next();
            System.out.println("Iterator saw key: " + k);
            Thread.sleep(50);
        }

        writer.join();
        System.out.println("Final map: " + cmap);
    }
}
