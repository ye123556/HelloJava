package practice.homework;
// 메인
import practice.homework.entity.Dice;
import practice.homework.entity.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <= list.size(); i++) */
        Scanner sc = new Scanner(System.in);

        System.out.println("플레이어 이름을 입력해 주세요.");
        //ArrayList<String> list = new ArrayList<String>();
        Player[] players = new Player[2];
        System.out.print("Player1 : ");
        players[0] = new Player(sc.next());
        System.out.print("player2 : ");
        players[1] = new Player(sc.next());

        System.out.println("주사위를 돌려주세요");

        Dice dice = new Dice();
        int result = dice.roll();









            System.out.println("┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌────────┐  ┌────────┐  ┌────────┐  \n" +
                               "│ START │  │       │  │       │  │       │  │        │  │        │  │ 1 Time │  \n" +
                               "│  !!   │  │       │  │       │  │       │  │        │  │        │  │  rest  │  \n" +
                               "└───────┘  └───────┘  └───────┘  └───────┘  └────────┘  └────────┘  └────────┘  \n" +
                               "┌───────┐                                                           ┌────────┐ \n" +
                               "│       │                                                           │        │ \n" +
                               "│       │                                                           │        │\n" +
                               "└───────┘                                                           └────────┘ \n" +
                               "┌───────┐                                                           ┌────────┐ \n" +
                               "│       │                                                           │        │ \n"+
                               "│       │                                                           │        │ \n"+
                               "└───────┘                                                           └────────┘ \n" +
                               "┌───────┐                                                           ┌────────┐ \n" +
                               "│       │                                                           │        │ \n"+
                               "│       │                                                           │        │ \n"+
                               "└───────┘                                                           └────────┘ \n" +
                               "┌───────┐  ┌───────┐  ┌───────┐  ┌───────┐  ┌────────┐  ┌────────┐  ┌────────┐  \n" +
                               "│       │  │       │  │       │  │       │  │        │  │        │  │        │  \n" +
                               "│       │  │       │  │       │  │       │  │        │  │        │  │        │  \n" +
                               "└───────┘  └───────┘  └───────┘  └───────┘  └────────┘  └────────┘  └────────┘  \n"
            );
    }
}
