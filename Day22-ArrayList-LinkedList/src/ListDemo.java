import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        // Adding elements
        arrayList.add("A");
        arrayList.add("B");
        linkedList.add("A");
        linkedList.add("B");

        // Accessing elements
        System.out.println("ArrayList element at index 1: " + arrayList.get(1));
        System.out.println("LinkedList element at index 1: " + linkedList.get(1));

        // Inserting in middle
        arrayList.add(1, "X");
        linkedList.add(1, "X");

        System.out.println("ArrayList after insert: " + arrayList);
        System.out.println("LinkedList after insert: " + linkedList);
    }
}
