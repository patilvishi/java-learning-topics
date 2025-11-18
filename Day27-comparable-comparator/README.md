# Day 27 – Comparable vs Comparator (Custom Sorting)

Sorting is one of the most common operations in Java.  
Java provides two powerful interfaces for sorting collections:

- **Comparable** → Natural ordering (inside the class)
- **Comparator** → External, flexible custom ordering

---

##  Comparable (Natural Sorting)
Implemented inside the class using `compareTo()`.

Example:
```java
public class Person implements Comparable<Person> {
    private int age;

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}

✔ Use When:

A class has one natural sorting (e.g., age, ID).

##  Comparator (Custom Sorting)

External comparison logic.

Example:

people.sort(Comparator.comparing(Person::getSalary));

✔ Use When:

Need multiple sorting logics.
Cannot modify the class.