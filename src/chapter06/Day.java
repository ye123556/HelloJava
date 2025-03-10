package chapter06;
// 20250124 - 7
import java.time.LocalDate;

// 날짜 클래스
public class Day {
    // 필드
    private int year = 1; // 년
    private int month = 1; // 월
    private int date = 1; // 일

    // 생성자
    public Day() {
        LocalDate today = LocalDate.now();
        this.year = today.getYear();
        this.month = today.getMonthValue();
        this.date = today.getDayOfMonth();
    }

    public Day(int year) { this.year = year; }

    public Day(int year, int month) {
        // this.year 대입은 중복 코드이므로 수정해보세요. this() : 자신의 생성자 호출
        // this() 또는 super()는 맨 위에 작성을 해주어야 함
        this(year); // 아래로 내려가면 오류가 난다.
        this.month = month;
    }
    public Day(int year, int month, int data) {
        this(year, month);
        this.date = data;
    }

    public Day(Day d) {
        // private지만 같은 클래스의 경우에는 접근이 가능함.
        this(d.year, d.month, d.date);
    }

    // getter 년, 월, 일 불러오기

    public int getYear() { return year = year; }

    public int getMonth() { return month = month; }

    public int getDate() { return date = date; }

    public void setYear(int year) { this.year = year;}

    public void setMonth(int month) { this.month = month;}

    public void setDate(int date) {this.date = date;}

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // 다른 날짜와 비교 equals
    public boolean equals(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

    @Override // 오타를 썻는지 안썻는지 확인해줌
    public String toString() {
        String[] wd = {"토","일", "월", "화", "수", "목", "금"};
        return String.format("%04d년 %02d월 %02d일 (%s)", year, month, date, wd[dayOfWeek()]);
    }

    // 요일 찾기
    public int dayOfWeek() {
        // 0: 토요일 1:일요일, 2: 월요일, 3: 화요일, 4: 수요일, 5: 목요일, 6: 금요일,
        // 그레고리안 달력을 전제로 하는 제라의 공식(1582년 10월 15일 이후의 요일 계산)
        int y = year;
        int m = month;
        int d =date;

        if(m == 1 || m == 2) {
            y--;
            m += 12;
        }
        int k = y%100;
        int j = y / 100;

        //return (d+(26*(m+1)/10)*k+k/4+j/4+5*j)%7;
        return (d + ((13 * (m + 1)) / 5) + k + (k/4) + (j/4) - 2*j) % 7;
    }
}
