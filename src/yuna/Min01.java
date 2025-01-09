package yuna;

import java.util.Scanner;

public class Min01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a:");
        int a = sc.nextInt();

        System.out.print("정수 b:");
        int b = sc.nextInt();

        System.out.print("정수 c:");
        int c = sc.nextInt();

        int min = Integer.MAX_VALUE;

      if(a<b && a<c) {
          min = a;
      } else if (b<a && b<c) {
          min = b;
      } else if (c < a && c < b) {
          min =c;
      }
        //세 정수 중에 최소값을  min에 저장하여 출력해주세요.

            System.out.println("최소값은 " + min + "입니다.");

        }
    }
    // Min3 변수 3개 비교하는 연산
    // a, b, c 비교하는 연산자