package Chapter04.lecture;

import java.util.Scanner;

public class Goingto5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받기
        int n = sc.nextInt();
        // 출력 예시
        // 예시) 정수값 : 5
        if (n > 0)
            if (n % 10 == 0) {
                System.out.println("이 값은 10으로 나누어 집니다.");

            } else
                System.out.println("이 값은 10로 나누어지지 않습니다.");
        else
            System.out.println("음의 정수를 입력했습니다.");
    }
}