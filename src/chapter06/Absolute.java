package chapter06;
//20250124 - 4
import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("int형 정수 a의 값:");
        int a = sc.nextInt();
        System.out.print("long형 정수 b의 값:");
        int b = sc.nextInt();
        System.out.print("float형 정수 c의 값:");
        int c = sc.nextInt();
        System.out.print("double형 정수 d의 값:");
        int d = sc.nextInt();

        System.out.println("a의 절대값은 " + absolute(a) + "입니다.");
        System.out.println("b의 절대값은 " + absolute(b) + "입니다.");
        System.out.println("c의 절대값은 " + absolute(c) + "입니다.");
        System.out.println("d의 절대값은 " + absolute(d) + "입니다.");
    }
    private static int absolute(int x) {
        return x >= 0? x : -x;
    }
    private static long absolute(long x) {
        return x >= 0? x : -x;
    }
    private static float absolute(float x) {
        return x >= 0? x : -x;
    }
    private static double absolute(double x) {
        return x >= 0? x : -x;
    }
}
