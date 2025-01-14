package Chapter04;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do{
            System.out.println("2 이상의 정수값:");
            n = sc.nextInt();
        }while (n<2);

        int i;

        //소수 구하기
        for (i = 2; i < n; i++) {
            if(n % i == 0) {
                break;
            }
        }
        //출력문
        if(i==n) {
            System.out.println("소수입니다.");
        }else {
            System.out.println("소수가 아닙니다.");
        }
    }
}

