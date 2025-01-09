package Chapter04;

import java.util.Scanner;

public class Grade1 {
    public static void main(String[] args) {
        // 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int point = sc.nextInt();

        // 수우미양가
        if (point >= 0 && point <= 49) { // 0 ~49
            System.out.println("가");
        } else if (point >= 50 && point <= 59) { // 50~ 59
            System.out.println("양");
        } else if (point >= 60 && point <= 69) {
            System.out.println("미");
        } else if (point >= 70 && point <= 79) {
            System.out.println("우");
        } else if (point >= 80 && point <= 89) {
            System.out.println("수");
        }

    }

}
