package day39;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    static class Employee {
        String name;
        String dept;
        int salary;

        Employee(String name, String dept, int salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public String getName() { return name; }
        public String getDept() { return dept; }
        public int getSalary() { return salary; }

        @Override
        public String toString() {
            return name + "(" + dept + ", " + salary + ")";
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Amit", "IT", 70000),
            new Employee("Ravi", "IT", 90000),
            new Employee("Suresh", "HR", 50000),
            new Employee("Neha", "HR", 60000),
            new Employee("Priya", "Sales", 65000)
        );

        // 1️ toList / toSet
        List<String> names = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println("Names: " + names);

        // 2️ groupingBy
        Map<String, List<Employee>> byDept =
                employees.stream()
                         .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("\nGrouped by Dept: " + byDept);

        // 3️ partitioningBy
        Map<Boolean, List<Employee>> highEarners =
                employees.stream()
                         .collect(Collectors.partitioningBy(
                             e -> e.getSalary() >= 70000));
        System.out.println("\nPartitioned by salary >= 70k: " + highEarners);

        // 4️ mapping (downstream collector)
        Map<String, List<String>> namesByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                             Employee::getDept,
                             Collectors.mapping(Employee::getName,
                                                 Collectors.toList())
                         ));
        System.out.println("\nNames by Dept: " + namesByDept);

        // 5️ reducing
        int totalSalary =
                employees.stream()
                         .collect(Collectors.reducing(
                             0,
                             Employee::getSalary,
                             Integer::sum));
        System.out.println("\nTotal Salary: " + totalSalary);
    }
}
