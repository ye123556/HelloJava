package practice.homework;
// 메인
import practice.homework.entity.Dice;
import practice.homework.entity.Player;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        int reach;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("플레이어 수 : ");
        int n = sc.nextInt();
        System.out.println("============= 주사위게임 시작 ==============");
        Player[] names = new Player[n];
        for (int i = 0; i < names.length; i++) {
            System.out.print("player" + (i+1) + ": ");
            String player = sc.next();
            names[i] = new Player(player);
        }
        reach = 20;
        Dice dice = new Dice(reach);
        while (true) {
            System.out.println("<" + Dice.rand + "Round> ");
            for (int i = 0; i < names.length; i++) {
                System.out.print("player" + (i + 1) + "님 위치 --> " + names[i].getLocation());
                if (i == names.length - 1)
                    System.out.println(" ");
                else
                    System.out.print(", ");

            }
            if (!Dice.exit(names)) // player[i]getLocation가 20이 넘어가면 반복문을 나온다.<2> ※
                break;

            for (int i = 0; i < names.length; i++) {
                do {
                    System.out.println("player" + (i+1) + "님 주사위를 던져주세요(0번 누르기!!)"); // 엔터로 해서 넘기는 방법 알아보기!
                    choice = sc.nextInt();
                    if (choice == 0) {
                        int roll = Dice.roll();
                        names[i].addLocation(Dice.value);
                    }
                    if (i < names.length - 1) {
                        System.out.println("-------------- 다음차례 --------------");
                    }
                }while (!(choice == 0));
            }
            Dice.rand++;
            System.out.println("\n");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  \n" +
                    "│ START │  │   1   │  │   2   │  │   3   │  │   4   │  │   5   │  │  처음  │  \n" +
                    "└───────┘  └───────┘  └───────┘  └───────┘  └───────┘  └───────┘  └───────┘  \n" +
                    "┌───────┐                                                         ┌───────┐  \n" +
                    "│  1 9  │                                                         │   7   │  \n" +
                    "└───────┘                                                         └───────┘  \n" +
                    "┌───────┐                                                         ┌───────┐  \n" +
                    "│ 18(-3)│                                                         │   8   │  \n" +
                    "└───────┘                                                         └───────┘  \n" +
                    "┌───────┐                                                         ┌───────┐  \n" +
                    "│  1 7  │                                                         │   9   │  \n" +
                    "└───────┘                                                         └───────┘  \n" +
                    "┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  \n" +
                    "│  1 6  │  │  1 5  │  │  1 4  │  │ 13(+3)│  │  1 2  │  │  1 1  │  │  1 0  │  \n" +
                    "└───────┘  └───────┘  └───────┘  └───────┘  └───────" +
                    "┘  └───────┘  └───────┘  \n"
            );
        }
    }
}