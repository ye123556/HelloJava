package chapter06;
//20250123
import java.util.Scanner;

public class PrintSeason {
    // 입력 범위에서 벗어날 경우 다시 입력 받기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sea;
        do {
            System.out.print("몇 월 입니까(1~12):");
            sea = sc.nextInt();
        } while (1 > sea || sea > 13); //(!(0 <= sea && sea <= 13))

        System.out.println("해당 월의 계정은 " + printSeason(sea) + "입니다.");
    }
    // 리턴 타입 void 또는 String
    // 봄 : 3,4,5월
    // 여름 : 6,7,8월
    // 가을 : 9,10,11
    // 겨울 : 12,1,2
    public static String printSeason(int m) {
        switch (m) {
            case 3: case 4: case 5:
                return "봄";
            case 6: case 7: case 8:
                return "여름";
            case 9: case 10: case 11:
                return "가을";
            case 12: case 1: case 2:
                return "겨울";
        }
        return "";
    }

}
