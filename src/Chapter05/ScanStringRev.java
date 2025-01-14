package Chapter05;

import java.util.Scanner;

public class ScanStringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열:");
        String str =sc.next(); // "안녕"

        System.out.println("반대로 읽으면");

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        // 거꾸로 읽어서 출력
        // 예시) "녕안"

        System.out.println("입니다.");
    }
}
