package Chapter04;

import java.util.Scanner;

public class Soft3Acending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();

        System.out.print("정수 b : ");
        int b = sc.nextInt();

        System.out.print("정수 c : ");
        int c = sc.nextInt();

        int temp;

        if(a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        //if(a > c) {
        //    temp = a;
        //    a=c;
        //   c=a;
        //}
        if(b > c) {
            temp = b;
            b=c;
            c=temp;
        }
        if(a > b) {
            temp = a;
            a=b;
            b=temp;
        }
        //변수 a, b, c를 작은 순으로 정렬

        // a가 b보다 크면 a와 b를 교환

        // b가 c보다 크면 b와 c를 교환

        // a가 b보다 크면 왜 또 교환을? 준우승자?
        // 순서 중요



        //출력
        System.out.println("a <= b <= c가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + "입니다.");
        System.out.println("변수 c는 " + c + "입니다.");

    }
}

//123
//132
//213
//231
//312
//321
