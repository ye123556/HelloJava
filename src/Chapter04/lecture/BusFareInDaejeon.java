package Chapter04.lecture;

import java.util.Scanner;

public class BusFareInDaejeon {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("만 나이 입력: ");
        int age = sc.nextInt();

        if(age >= 19) {
            System.out.print("일반(만19세 이상) : ");
            System.out.println("1500원");
        } else if (age >= 13) {
            System.out.print("청소년(만13세~18세) : ");
            System.out.println("750원");
        } else if (age >= 6) {
            System.out.print("어린이(6세 ~ 12세) : ");
            System.out.println("350원");
        } else if (age >= 0) {
            System.out.print("6세 미만 : ");
            System.out.println("무료");
        } else {
            System.out.print("음수 입력할 경우 : ");
            System.out.println("나이를 잘못 입력하였습니다.");
        }
    }
}

// 버스 요금 기준
// 음수 입력할 경우 : "나이를 잘못 입력하셨습니다."
// 일반(19세 이상) : 1500원
// 청소년(13세~18세) : 750원
// 어린이(6세~12세) : 350원
// 6세 미만 : 무료