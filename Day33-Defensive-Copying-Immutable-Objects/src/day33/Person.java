package day33;

import java.util.Date;

/**
 * Immutable class using defensive copying
 */
public final class Person {

    private final String name;
    private final Date dateOfBirth;

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        // Defensive copy in constructor
        this.dateOfBirth = new Date(dateOfBirth.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        // Defensive copy in getter
        return new Date(dateOfBirth.getTime());
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', dob=" + dateOfBirth + "}";
    }
}
