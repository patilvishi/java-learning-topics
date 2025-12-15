// Demonstrates fail-safe iterator (CopyOnWriteArrayList)
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> cowList = new CopyOnWriteArrayList<>(new String[]{"A","B","C"});
        System.out.println("Original COW list: " + cowList);

        for (String s : cowList) {
            System.out.println("Visiting: " + s);
            if (s.equals("B")) {
                // Safe: modifies underlying array copy; iterator sees snapshot
                cowList.remove(s);
                cowList.add("D");
                System.out.println("Modified COW during iteration (remove B, add D)");
            }
        }

        System.out.println("After iteration, current list: " + cowList);
    }
}
