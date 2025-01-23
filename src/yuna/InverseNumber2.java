package yuna;
// 메소드 빼는 법 연습하기
import java.util.Scanner;

public class InverseNumber2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean needRetry;

    do{
        // readPlusInt() - class로 묶는다
        // startResion : 양의 정수만 입력 받기
        int n;

        do {
            System.out.println("양의 정수값:");
            n = sc.nextInt();
        } while(n <= 0);
        // endRegion : 양의 정수만 입력 받기

        // printInverseNumber - 클래스를 묶는다
        // startRegion : 입력 받은 n을 반대로 읽는 로직
        StringBuilder sb = new StringBuilder();

        sb.append(n);
        sb.reverse();

        System.out.println("반대로 읽으면 " + sb.toString() + "입니다.");
        // endRegion : 입력 받은 n을 반대로 읽는 로직

        // shouldRetry - class로 묶음
        // startResion : 재시도 여부 확인
        int input;

        do {
            System.out.println("다시 한 번?: <Yes...1/No...0>:");
            input = sc.nextInt();
        } while(input != 1 && input != 0);

        needRetry = (input == 1);
        // endRegion : 재시도 여부 확인

        } while (needRetry);
    }
}
