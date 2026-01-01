package day34;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "a@test.com");
        Employee e2 = new Employee(1, "a@test.com");
        Employee e3 = new Employee(2, "b@test.com");

        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println("e1 hashCode == e2 hashCode: " +
                (e1.hashCode() == e2.hashCode()));

        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println("HashSet contents: " + set);
        System.out.println("HashSet size: " + set.size());
    }
}
