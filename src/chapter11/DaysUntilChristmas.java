package chapter11;
// 20250211 - 05
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

// 오늘 날짜 기준으로 올해 크리스마스(12월 15일)까지 남은 일수를 계산하는 프로그램
// 크리스마스가 이미 지났다면, 내년 크리스마스까지 남은 일수를 계산하도록 만들기
public class DaysUntilChristmas {
    public static void main(String[] args) {
        // 오늘 날짜 가져오기
        LocalDate now = LocalDate.now();
        System.out.println("오늘 날짜 : " + now);

        // 올해 크리스마스 날짜 설정
        LocalDate christmas = LocalDate.of(2025, Month.DECEMBER,25);
        System.out.println("올해 크리스마스 : " + christmas);

        // 만약 크리스마스가 이미 지났다면.. 내년 크리스마스로 변경
        if(now.isAfter(christmas)){
            christmas = christmas.plusYears(1);
        }
          /*if (boolean isAfter = now.isAfter(christmas)){
                    System.out.println(christmas.plus(1, ChronoUnit.YEARS));
                }*/
        // 오늘부터 크리스마스까지 남은 일수 계산
        /*long daysBeteen = ChronoUnit.DAYS.between(christmas, now);*/
        long daysBeteen = ChronoUnit.DAYS.between(now, christmas);
        System.out.println("크리스마스 남은 일수 : " + daysBeteen);

        // 결과 출력
        // 21번째 줄 다시보기
    }
}
