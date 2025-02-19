package chapter06.lecture;
// 20250121-1
public class Bike {
    // 고유데이터
    public  String company;

    String model;

    String color;

    // 상태 데이터
    int speed;

    // 주행 메서드 : "주행 시작" 출력
    // 접근제한자 리턴타입 drive() {
    public void drive() { // 메서드는 동사
        // speed의 값은 얼마일까? speed가 0이 아니면 이미 주행이 시작
        if(speed == 0) {
            //speed의 값은 얼마일까? 0, 2, 100
            System.out.println("주행시작");
            accelerate(1);
        } else
            System.out.println("이미 주행 중입니다.");

        displaySpeed();
    }

    // 정지 메서드 : "정지" 출력
    public void stop() {
        if (speed == 0)
            System.out.println("이미 정지했습니다.");
        else {
            speed = 0;
            System.out.println("정지");
        }
        displaySpeed();
    }

    // 가속 메서드 : 파라미터 값만큼 속도 증가 // accelerate 메서드 : 파라미터 값만큼 속도 증가
    public  void  accelerate(int increment) {
        this.speed += increment;
        if(increment > 0) {
            System.out.println("가속합니다.");
        } else if (increment == 0) {
            System.out.println("등속 운동을 합니다.");
        } else {
            if(speed >= 0)
                System.out.println("감속합니다.");
            else
                System.out.println("후진합니다.");
        }

        displaySpeed();

    }

    public void displaySpeed() {
        System.out.println("현재속도: " + speed);
    }

}
