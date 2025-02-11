package chapter11;
//20250211-06
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// 두 날짜 간의 차이 계산
public class DateDifferenceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번재 날짜 입력 받기
        System.out.print("첫 번째 날짜를 입력하세요. (yyyy.MM.dd): ");
        String firstInput = scanner.nextLine();

        // 두 번재 날짜 입력 받기
        System.out.print("두 번째 날자를 입력하세요. (yyyy-MM-dd): ");
        String secondInput = scanner.nextLine();

        // 문자열을 LocalDate로 변환
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondInput,formatter);

        System.out.println(firstDate);
        System.out.println(secondDate);

        // 두 날짜 간의 차이 계산
        Period period = Period.between(firstDate, secondDate);

        // 결과 출력
        System.out.println("두 날짜 간의 차이: ");
        System.out.println(period.getYears() + "년 "
                + period.getMonths() + "월 "
                + period.getDays() + "일");
        System.out.println(period); //보류
    }
}
