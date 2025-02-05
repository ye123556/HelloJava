package chapter07.lecture;
//20250204
// 추상 클래스 정의
public abstract class Animal {
    protected String name; // 지어준 이름

    protected Animal() {} // "자식에게 공유하려면 protected!"

    protected Animal(String name) {
        this.name = name;
    }

    // 공통 메서드
    public void makeSoundWhileMoving() {
        move();
        makeSound();
    }
    // 추상 메소드 정의 (구현을 강제)
    // 추상 메소드가 최소 1개 이상이라면 추상 클래스로 변경 필요
    abstract protected void makeSound();
    abstract protected void move();
}
