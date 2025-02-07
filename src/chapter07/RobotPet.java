package chapter07;
// 20250206
public class RobotPet extends Pet {
    // 필드


    // 생성자
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    // 자기소개
    @Override
    public void introduce() {
        System.out.println("나의 이름은 " + getName() + "입니다.");
        System.out.println("주인님의 이름은 " + getMasterName() + "입니다.");
    }


    // 가사일 하기
    public void work(int sw) {
        switch (sw) {
            case 0:
                System.out.println("청소를 합니다.");
                break;
            case 1:
                System.out.println("세탁을 합니다.");
                break;
            case 2:
                System.out.println("밥을 합니다.");
                break;
        }
    }


}
