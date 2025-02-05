package chapter07.lecture;
//20250204
public class Dog extends Animal {
    // String name; // 지어준 이름을 또... 선언?

    String species;

    public Dog() {
        super("무명 강아지");
    }

    // 생성자
    public Dog(String name, String species) {
        super(name);
        /*this.name = name;*/
        this.species = species;
    }

    @Override
    protected void makeSound() {
        System.out.println(name + "가 멍멍 짖습니다.");
    }

    @Override
    public void move() {
        System.out.println(name + "가 뛰어다닙니다.");
    }
}
