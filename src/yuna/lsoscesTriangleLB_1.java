package yuna;

import java.util.Scanner;

public class lsoscesTriangleLB_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? :");
        int n = scanner.nextInt();

        //왼쪽 아래가 직각인 이등변 삼각형을 출력
        for (int i = 0; i < n; i++) {
            for (int j = n ; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
