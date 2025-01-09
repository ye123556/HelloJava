package Chapter04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int x;

        do{
            System.out.print("양의 정수값 : ");
            x = sc.nextInt();
        }while (x <= 0);

            // while문
            while(x >= 0) {
                // --x로 변경 해보자
                System.out.println(x--); // x값을 표시한 후 감소시킴
                //System.out.println("x의 값이 " + x + "이 되었습니다."); //x 갑 표시
                Thread.sleep(1000);
            }

            }


            }

