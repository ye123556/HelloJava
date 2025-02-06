package chapter07;
//20250206-4
public abstract class Animal {
    // 필드
    private String name;

    // 생성자

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 템플릿 메서드 패턴
    public void intrduce() {
        System.out.println(toStr() + "이다. ");
        bark();
    }

    public abstract void bark(); // 짖기
    public abstract String toStr();
}
