package practice.homework.entity;

//20250120, 플레이어 + 이벤트발생

public class Player {
    private String player; // ? 사용 왜 안함?
    private int location;


    public Player(String player) {
        player = player; // 사용안함
        location = 0;
    }

    public int getLocation() { return location; }

    public void addLocation(int num) {
        location += num;
        if (location == 6) {
            location = 0;
        }
        if (location == 18)
            location -= 3;
        if (location == 13)
            location += 2;

    }
}
