package Chapter04;

import java.util.Scanner;

public class SumContinueAve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수를 더합니다.");
        System.out.println("몇 개를 더할까요?");

        int n = sc.nextInt();

        int sum = 0; // 합계
        int count = 0; // 양의 정수의 개수

        int i;

        for (i = 0; i < n; i++) {
            System.out.println("정수:");
            int temp = sc.nextInt();

            //음수이면 continue 수행으로 아래 코드는 생략
            if (temp < 0){
                System.out.println("음수는 더하지 않습니다.");
                continue;
            }

            //if (temp > 0) {
                sum += temp;
                count += 1;
            //}
        }

        System.out.println("합계는 " + sum + "입니다.");
        if(i != 0)
            System.out.println("평균은 " + sum / count + "입니다.");
    }
}
