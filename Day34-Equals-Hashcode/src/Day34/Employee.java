package day34;

import java.util.Objects;

public class Employee {

    private final int id;
    private final String email;

    public Employee(int id, String email) {
        this.id = id;
        this.email = email;
    }

    // equals() contract implementation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;              // reflexive
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
               Objects.equals(email, employee.email);
    }

    // hashCode() contract implementation
    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", email='" + email + "'}";
    }
}
