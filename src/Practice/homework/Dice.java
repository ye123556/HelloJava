package Practice.homework;

import Practice.homework.entity.Player;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("플레이어 이름을 입력해 주세요.");

        Player[] players = new Player[2];
        System.out.print("Player1 : ");
        players[0] = new Player(sc.next());
        System.out.print("player2 : ");
        players[1] = new Player(sc.next());

        System.out.println("주사위를 돌려주세요");

        int num = random.nextInt(6)+1;
        String result = null;

        switch (num) {
            case 1:
                result = "주사위 1 \n" +
                        "┌─────┐ \n" +
                        "│  *  │ \n" +
                        "└─────┘ ";
                break;
            case 2:
                result = "주사위 2 \n" +
                        "┌─────┐ \n" +
                        "│  *  │ \n" +
                        "│  *  │ \n" +
                        "└─────┘ ";
                break;
            case 3:
                result = "주사위 3 \n" +
                        "┌──────┐ \n" +
                        "│   *  │ \n" +
                        "│  * * │ \n" +
                        "└──────┘ ";
                break;
            case 4:
                result = "주사위 4 \n" +
                        "┌──────┐ \n" +
                        "│  * * │ \n" +
                        "│  * * │ \n" +
                        "└──────┘ ";
                break;
            case 5:
                result = "주사위 5 \n" +
                        "┌────────┐ \n" +
                        "│   * *  │ \n" +
                        "│    *   │ \n" +
                        "│   * *  │ \n" +
                        "└────────┘ ";
                break;
            case 6:
                result = "주사위 6 \n" +
                        "┌────────┐ \n" +
                        "│   * *  │ \n" +
                        "│   * *  │ \n" +
                        "│   * *  │ \n" +
                        "└────────┘ ";
                break;
        }
        System.out.println(result);
    }

}
