package chapter07.lecture;
//20250203-1
public class Car {
    public int speed;

    /*protected*/public int numberOfDoor;

    /*protected*/public Car() {}

    /*protected*/  Car(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public void speedUp() {
        speed += 1;
        System.out.println("speed = " + speed);
    }

    // final 메소드, 재정의 불가능하게
    public final void stop() {
        speed = 0;
        System.out.println("차를 멈춤");
    }
}
