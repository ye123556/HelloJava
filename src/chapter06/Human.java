package chapter06;
//20250124

public class Human {

    // 필드
    /*private static int counter = 0;// 몇번까지 식별 번호를 부여 했는가*/

    private Id id; // int 대신 Id

    private String name; // 이름

    private int height; // 신장

    private int weight; //제중

    private Day birthday;// 생일

    // 생성자
    public Human(String name, int height, int weight, Day birthday) {
        /*this.id = ++counter;*/
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;

    }

    // getter
    public Id getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public Day getBirthday() {
        return birthday;
    }

    // 메서드
    void gainWeight(int w) {
        this.weight += w;
    }

    void reduceWeight(int w) {
        this.weight -= w;
    }

    // toString
    @Override
    public String toString() {
        return "{" + name + ": " + height + "cm" + weight + "kg" + birthday + "출생" + '}';
    }
}
