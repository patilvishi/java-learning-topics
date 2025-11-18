import java.util.*;

public class ComparatorExamples {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
            new Person("Vishwanath", 32, 85000),
            new Person("Amit", 28, 60000),
            new Person("Rahul", 35, 95000),
            new Person("Suresh", 28, 72000)
        ));

        System.out.println("Original List:");
        people.forEach(System.out::println);

        // 1️ Natural Sorting - Comparable (Age)
        Collections.sort(people);
        System.out.println("\nSorted by Age (Comparable):");
        people.forEach(System.out::println);

        // 2️ Custom Sorting Using Comparator (Salary)
        people.sort(Comparator.comparingDouble(Person::getSalary).reversed());
        System.out.println("\nSorted by Salary (High → Low):");
        people.forEach(System.out::println);

        // 3️ Multiple-Level Sorting: Age → Name
        people.sort(Comparator.comparing(Person::getAge)
                              .thenComparing(Person::getName));

        System.out.println("\nSorted by Age → Name:");
        people.forEach(System.out::println);

        // 4️ Anonymous Comparator Example
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("\nSorted by Name (Anonymous Comparator):");
        people.forEach(System.out::println);
    }
}
