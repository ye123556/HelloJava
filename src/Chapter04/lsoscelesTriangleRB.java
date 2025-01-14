package Chapter04;

import java.util.Scanner;

public class lsoscelesTriangleRB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는? :");
        int n = sc.nextInt();

        // 오른쪽 아래가 직각인 이등변 삼각형을 출력
        for (int i = 0; i < n; i++) { // i<= n
            for(int j = 0; j <n; j++) { // j <=n
                if (j< n-(i+1)) // n-i-1
                    System.out.print(" "); // 2번째라인  : * 2개이므로, n개  - 2
                else
                    System.out.print("*");  // 1번째라인  : * 1개, n개  - 1
            }
            System.out.println();
        }
    }
}
