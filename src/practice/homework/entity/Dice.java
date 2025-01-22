package practice.homework.entity;
// 주사위 객체
import java.util.Random;

public class Dice {
    int value;

    public int roll() {
        Random rd = new Random();
        value += rd.nextInt(6) + 1;

        String result = "";

        switch (value) {
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

        return 0;
    }
}
