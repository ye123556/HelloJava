package practice.homework.entity;
// 주사위 + 게임끝내기
import java.util.Random;

public class Dice {
    public static int reach ;
    public static int value;
    public static int rand;

    public Dice (int dice) {
        reach = dice;
        rand = 1;
    }



    public static int roll() {
        Random rand = new Random();
        value = rand.nextInt(6)+1;
        String result = "";

        switch (value) {
            case 1:
                result = "주사위" + value +  "\n" +
                        "┌─────┐ \n" +
                        "│  *  │ \n" +
                        "└─────┘ ";
                break;
            case 2:
                result = "주사위" + value + "\n" +
                        "┌─────┐ \n" +
                        "│  *  │ \n" +
                        "│  *  │ \n" +
                        "└─────┘ ";
                break;
            case 3:
                result = "주사위" + value + "\n" +
                        "┌──────┐ \n" +
                        "│   *  │ \n" +
                        "│  * * │ \n" +
                        "└──────┘ ";
                break;
            case 4:
                result = "주사위" + value + "\n" +
                        "┌──────┐ \n" +
                        "│  * * │ \n" +
                        "│  * * │ \n" +
                        "└──────┘ ";
                break;
            case 5:
                result = "주사위" + value + "\n" +
                        "┌────────┐ \n" +
                        "│   * *  │ \n" +
                        "│    *   │ \n" +
                        "│   * *  │ \n" +
                        "└────────┘ ";
                break;
            case 6:
                result = "주사위" + value + "\n" +
                        "┌────────┐ \n" +
                        "│   * *  │ \n" +
                        "│   * *  │ \n" +
                        "│   * *  │ \n" +
                        "└────────┘ ";
                break;
        }
        System.out.println(result);

        return 0;
    }
    public static boolean exit(Player[] players) { // 이부분 자세히 보기!!(정리도!)<1>
        boolean isContinued = true;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getLocation() >= reach) {
                isContinued = false;
                System.out.println("player" + (i+1) + "이(가) 승리하였습니다.");
                System.out.println("게임이 끝났습니다.");
            }
        }
        return isContinued; // ※
    }
}
