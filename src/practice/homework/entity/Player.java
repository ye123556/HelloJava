package practice.homework.entity;
//20250120
public class Player {
    private String player;

    public Player(String player) {
        this.player = player;
    }

    /*while(player == 20)
    Dice diceplay = new Dice();
    int turn = diceplay.roll();*/


    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                '}';
    }


}
