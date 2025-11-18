public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Comparable -> Natural ordering (sort by age)
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (Age=" + age + ", Salary=" + salary + ")";
    }
}
