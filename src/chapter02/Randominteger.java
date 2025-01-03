package chapter02;

import java.util.Random;

public class Randominteger {
    public static void main(String[] args) {
        Random rand = new Random();

        int n1 = rand.nextInt(9);

        System.out.println("임의의 정수 값은 "+ n1);
    }
}
