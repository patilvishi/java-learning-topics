package day28;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<>();

        // 1️ Add elements at both ends
        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");
        deque.addLast("D");

        System.out.println("Deque After Insertions: " + deque);

        // 2️ Remove from both ends
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Deque Now: " + deque);

        // 3️ Stack Behavior
        deque.push("X");
        deque.push("Y");

        System.out.println("Stack Mode (push): " + deque);
        System.out.println("Popped: " + deque.pop());

        // 4️ Queue Behavior
        deque.offer("Z");
        deque.offer("P");

        System.out.println("Queue Mode (offer): " + deque);
        System.out.println("Polled: " + deque.poll());
    }
}
