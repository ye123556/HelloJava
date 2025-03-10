package chapter06;
// 20250124

import java.util.Scanner;

public class DayTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("day1을 입력하자.");
        System.out.print("년:");
        int y = sc.nextInt();
        System.out.print("월:");
        int m = sc.nextInt();
        System.out.print("일:");
        int d = sc.nextInt();

        Day day1 = new Day(y, m, d);
        System.out.println("day1 = " + day1);

        Day day2 = new Day(day1);
        System.out.println("day2를 day1과 같은 날짜로 만들었습니다.");
        System.out.println("day2 = " + day2);

        if(day1.equals(day2))
            System.out.println("day1과 day2가 같습니다.");
        else
            System.out.println("day1rhk day2가 다릅니다.");

        Day d1 = new Day();
        Day d2 = new Day(2023);
        Day d3 = new Day(2023, 10);
        Day d4 = new Day(2023, 10, 15);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);

        Day[] days = new Day[3];

        for(int i = 0; i < days.length; i++) {
            days[i] = new Day();
            System.out.println("a[" + i +"] = " + days[i]);
        }
    }
}
