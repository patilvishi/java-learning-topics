// Demonstrates fail-fast iterator (ArrayList)
import java.util.*;

public class FailFastDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("A", "B", "C"));
        System.out.println("Original list: " + list);

        try {
            for (String s : list) {
                System.out.println("Visiting: " + s);
                if (s.equals("B")) {
                    // Structural modification during iteration
                    list.remove(s); // Causes ConcurrentModificationException
                }
            }
        } catch (ConcurrentModificationException cme) {
            System.out.println("Caught: " + cme);
        }

        System.out.println("Final list: " + list);
    }
}
