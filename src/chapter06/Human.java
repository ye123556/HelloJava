package chapter06;
//20250124 - 5
public class Human {

    // 필드
    private String name; // 이름

    private int height; // 신장

    private int weight; //제중

    // 생성자
    public Human(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

    }
    // getter
    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    // 메서드
    void gainWeight(int w) {
        this.weight += weight;
    }

    void reduceWeight(int w) {
        this.weight -= weight;
    }
}
