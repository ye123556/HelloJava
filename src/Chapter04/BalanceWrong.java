package Chapter04;

import java.util.Scanner;

public class BalanceWrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Wring Case : 2_147_483_647
        System.out.println("변수 A :");
        int a = sc.nextInt();

        // Wrong Case : -1
        System.out.println("변수 B :");
        int b = sc.nextInt();

        // int diff = a - b;

        if (a > b)
            System.out.println("A가 크다.");
        else if (a < b)
            System.out.println("B가 크다.");
        else
            System.out.println("A와 B가 같다.");
    }
}
