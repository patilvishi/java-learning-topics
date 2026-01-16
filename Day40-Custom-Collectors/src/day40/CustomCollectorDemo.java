package day40;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectorDemo {

    static class Employee {
        String name;
        String dept;
        int salary;

        Employee(String name, String dept, int salary) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
        }

        public int getSalary() { return salary; }

        @Override
        public String toString() {
            return name + "(" + salary + ")";
        }
    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
            new Employee("Amit", "IT", 70000),
            new Employee("Ravi", "IT", 90000),
            new Employee("Suresh", "HR", 50000)
        );

        // 1️ Mutable Reduction using built-in collector
        List<String> names =
                employees.stream()
                         .map(e -> e.name)
                         .collect(Collectors.toList());

        System.out.println("Names: " + names);

        // 2️ Custom Collector: Sum of salaries
        Collector<Employee, int[], Integer> salarySumCollector =
                Collector.of(
                    () -> new int[1],                 // supplier
                    (acc, e) -> acc[0] += e.salary,   // accumulator
                    (a, b) -> { a[0] += b[0]; return a; }, // combiner
                    acc -> acc[0]                     // finisher
                );

        int totalSalary =
                employees.stream().collect(salarySumCollector);

        System.out.println("Total Salary: " + totalSalary);
    }
}
