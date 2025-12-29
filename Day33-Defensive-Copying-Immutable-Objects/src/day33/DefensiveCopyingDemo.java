package day33;

import java.util.Date;

public class DefensiveCopyingDemo {

    public static void main(String[] args) {

        Date dob = new Date();
        Person person = new Person("Vishwanath", dob);

        System.out.println("Original person: " + person);

        // Attempt to mutate the original Date
        dob.setTime(0);
        System.out.println("After modifying external Date:");
        System.out.println("Person still unchanged: " + person);

        // Attempt to mutate via getter
        Date exposedDob = person.getDateOfBirth();
        exposedDob.setTime(100000);

        System.out.println("After modifying Date from getter:");
        System.out.println("Person still unchanged: " + person);
    }
}
