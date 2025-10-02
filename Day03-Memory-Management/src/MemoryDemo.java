public class MemoryDemo {

    static class Person {
        String name;
        Person(String name) { this.name = name; }
    }

    public static void main(String[] args) {
        int primitiveValue = 42; // stored in Stack
        Person p1 = new Person("Alice"); // p1 ref in Stack, object in Heap
        Person p2 = p1; // p2 ref in Stack → same Heap object

        System.out.println("p1 name: " + p1.name);
        System.out.println("p2 name: " + p2.name);

        p1 = null; // p1 reference gone, but object still reachable via p2
        System.gc(); // request GC (not guaranteed)
    }
}
