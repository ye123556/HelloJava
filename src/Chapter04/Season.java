package Chapter04;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("몇 월입니까?");

        int month = sc.nextInt();

        switch (month) {
            case 3: case 4: case 5:
                System.out.println("봄");
                break;
            case 6: case 7: case 8:
                System.out.println("여름");
                break;
            case 9: case 10: case 11:
                System.out.println("가을");
                break;
            case 12: case 1: case 2:
                System.out.println("겨울");
                break;
            default:
                System.out.println("그런 월은 없습니다.");
                break;
        }
    }
}
