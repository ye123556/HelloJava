package chapter11.lecture;
 // 20250211 - 01
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

// LocalData, LocalTime
public class NewTimeEx1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDate birthDate = LocalDate.of(1999, 12, 31);
        LocalTime birthTime = LocalTime.of(23, 59, 59);

        System.out.println("today = " + today);
        System.out.println("now = " + now);
        System.out.println("birthDate = " + birthDate);
        System.out.println("birthTime = " + birthTime);

        birthDate = birthDate.withYear(1999);
        birthDate = birthDate.withMonth(1);
        birthDate = birthDate.withDayOfMonth(20);

        // System.out.println(birthDate.withYear(2000)); // 1999 -> 2000-12-31
        System.out.println("birthDate = " + birthDate);
        System.out.println(birthDate.plusDays(1)); // 2000-01-01
        System.out.println(birthDate.plus(1, ChronoUnit.DAYS)); // 2000-01-01
        System.out.println(birthDate.minusDays(1));
        System.out.println(birthDate.minus(1, ChronoUnit.MONTHS));
        System.out.println(birthDate.minus(30, ChronoUnit.DAYS));

        // 23:59:59 -> 23:00:00
        System.out.println(birthTime.truncatedTo(ChronoUnit.HOURS));

        // 특정 ChronoField의 범위를 알아내는 방법
        System.out.println(ChronoField.CLOCK_HOUR_OF_DAY.range()); // 1-24
        System.out.println(ChronoField.HOUR_OF_DAY.range()); // 0-23
    }
}
