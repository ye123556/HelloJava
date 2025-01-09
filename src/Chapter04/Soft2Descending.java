package Chapter04;

import java.util.Scanner;

public class Soft2Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();

        System.out.print("정수 b : ");
        int b = sc.nextInt();

        int temp;

        if(a < b) { // 순서 잘 배치
            temp = a;
            a = b;
            b = temp;
        }


        //a가 최대값이 아닌 경우 변수 swap

        System.out.println("a >= b 가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수는 b는 " + b + "입니다.");
    }
}
