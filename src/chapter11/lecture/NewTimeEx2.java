package chapter11.lecture;
 // 20250211-02
import java.time.LocalDateTime;

public class NewTimeEx2 {
    public static void main(String[] args) {
        // 2015년 12월 31일 12시 34분 56초
        LocalDateTime dt1 = LocalDateTime.of(2015, 12, 31, 12, 34, 56);
        LocalDateTime dt2 = LocalDateTime.now();

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println();
    }
}
