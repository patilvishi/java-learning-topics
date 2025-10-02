import java.time.*;
import java.util.Optional;

public class Day9Demo {
    public static void main(String[] args) {
        // ---------- Optional ----------
        Optional<String> maybeName = Optional.of("Alice");
        System.out.println("Name: " + maybeName.orElse("Unknown"));

        Optional<String> emptyName = Optional.empty();
        System.out.println("Empty fallback: " + emptyName.orElse("Unknown"));

        maybeName.ifPresent(n -> System.out.println("Upper: " + n.toUpperCase()));

        // ---------- java.time API ----------
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1990, Month.JULY, 15);
        Period age = Period.between(birthday, today);
        System.out.println("Age: " + age.getYears() + " years");

        LocalTime now = LocalTime.now();
        System.out.println("Current Time: " + now);

        LocalDateTime meeting = LocalDateTime.of(today, LocalTime.of(14, 30));
        System.out.println("Meeting at: " + meeting);

        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time: " + zoned);
    }
}
