package yuna;

import java.util.Random;
import java.util.Scanner;

public class problem {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);


        int playerHand = sc.nextInt();
        int computerHand = rand.nextInt(3); // 0~ 2 사이의 난수 발생

        System.out.println("컴퓨터가 낸 것 : ");
        switch (computerHand) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
        System.out.println("사용자가 낸 것 : ");
        if(playerHand == 0) {
            System.out.println("가위");
        }
        if(playerHand == 1) {
            System.out.println("바위");
        }
        if(playerHand == 2) {
            System.out.println("보");
        }

    }
}

