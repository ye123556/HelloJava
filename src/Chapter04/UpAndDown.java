package Chapter04;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);

        int targetNumber = 10 + rand.nextInt(90); // 맞춰야 하는 숫자 : 10 ~ 99 중에 생성

        System.out.println("숫자 맞추기 게임 시작!");
        System.out.println("10부터 99사이의 숫자를 맞추세요.");

        int guessNumber;

        do {
            System.out.println("어떤 숫자일까?");
            guessNumber = sc.nextInt();
            if(guessNumber < targetNumber) {
                System.out.println("더 큰숫자입니다.");
            }
            else if(guessNumber > targetNumber) {
                System.out.println("더 작은 숫자입니다.");
            }
            else
                System.out.println("정답입니다.");

        } while(guessNumber != targetNumber);//while(targetNumber<100);
        //반복을 통해 스캐너로 guessNumber 입력받기
        // 반복문은 for, while, do-while.. 최소 한번은 받아야 하기 때문에 do-while 추천
        // 맞춰야 하는 숫자보다 입력한 값이 작으면 "더 큰숫자입니다. 출력 :
        //맞춰야 하는 숫자보다 입력한 값이 크면 "더 작은 숫자입니다. 출력 :
        // 정답을 맞췄으면 "정답입니다." 출력
    }
}
