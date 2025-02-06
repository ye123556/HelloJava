package chapter07;

import java.util.ArrayList;

// 20250206 - 11
public class WearableTester {
    public static void main(String[] args) {
        ArrayList<Wearable> devices = new ArrayList<>();

        // Wearable a = new Wearable() // 추상클래스 객체 생성 x
        /*Wearable[] devices = new Wearable[2];*/ // 배열로 할때

        // Wearable을 상속한 구현체를 인터페이스 배열로 같이 담는 것이 가능
        devices.add(new Headphone()); // 헤드폰
        /*[0] = new Headphone();*/
        devices.add(new SmartWatch()); // 스마트워치

        for (Wearable device : devices) {
            device.putOn();
        }

        for (Wearable device : devices) {
            device.putOff();
        }

        Wearable device1 = new Headphone();
        device1 = new SmartWatch();

        // 인스턴스가 교체되도 동작을 보장(같은 추상 클래스 및 추상 메서드 상속)
        device1.putOn();
        device1.putOff();

        // 추상 메소드 외에 하위 클래스이 메서드를 사용하려면
        // 다운 캐스팅의 불편함은 감수해야 함
        if(device1 instanceof Headphone) {
            ((Headphone) device1).setVolume(5);
        } else if (device1 instanceof SmartWatch) {
            ((SmartWatch) device1).reset();
        }
    }
}
