package practice.homework.entity;
//20250120
public class Player {
    private String player;

    public Player(String player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "Player{" +
                "player='" + player + '\'' +
                '}';
    }
}
