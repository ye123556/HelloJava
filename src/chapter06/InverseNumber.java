package chapter06;
//20250123
import java.util.Scanner;

public class InverseNumber {
    public static Scanner sc = new Scanner(System.in); // 정적으로 변한다

    public static void main(String[] args) {

        boolean needRetry;

        do {
            // readPlusInt()
            int n = readPlusInt();

            // printInverseNumber
            printInverseNumber(n);

            // shouldRetry
            needRetry = shouldRetry();

        } while (needRetry);
    }

    public static int readPlusInt() {
        // startResion : 양의 정수만 입력 받기
        int n;

        do {
            System.out.println("양의 정수값:");
            n = sc.nextInt();
        } while (n <= 0);
        // endRegion : 양의 정수만 입력 받기
        return n;
    }

    public static void printInverseNumber(int n) {
        // startRegion : 입력 받은 n을 반대로 읽는 로직
        StringBuilder sb = new StringBuilder();

        sb.append(n);
        sb.reverse();

        System.out.println("반대로 읽으면 " + sb.toString() + "입니다.");
        // endRegion : 입력 받은 n을 반대로 읽는 로직
    }

    public static boolean shouldRetry() {
        // startResion : 재시도 여부 확인
        int input;

        do {
            System.out.println("다시 한 번?: <Yes...1/No...0>:");
            input = sc.nextInt();
        } while (input != 1 && input != 0);

        return (input == 1);
        // endRegion : 재시도 여부 확인
    }
}


