package chapter07;
//20250204
abstract class Tire{
    String brand;

    Tire(String brand) {
        this.brand = brand;
    }

    void roll() {
        System.out.println(brand + " 타이어가 굴러갑니다.");
    }

    abstract void broke();
}

class KumhoTire extends Tire {
    KumhoTire() {
        super("금호");
    }

    @Override
    void roll() {
        System.out.println(brand + " 타이어가 경쾌하게 굴러갑니다.");
    }

    @Override
    void broke() {
        System.out.println(brand + " 타이어가 고장났지만 30분 더 주행 가능합니다.");
    }
}

class HanKookTire extends Tire {
    HanKookTire() {
        super("한국");
    }
    @Override
    void roll() {
        System.out.println(brand + " 타이어가 부드럽게 굴러갑니다.");
    }

    @Override
    void broke() {
        System.out.println(brand + " 타이어가 고장났지만 바로 교체가 필요합니다.");
    }
}

/*class Seat extends Tire{
    Hyundai() {
        super("현대");
    }

    @Override
    void roll() {
        super.roll();
    }

    @Override
    void broke() {

    }
}*/

class MyCar {
    Tire frontLeftTire;
    Tire frontRightTire;
    Tire rearLeftTire;
    Tire rearRightTire;

    Tire leatherseat;
    Tire textileseat;
    Tire transmissionseat;
    Tire activeheadrestseat;



    public MyCar(Tire frontTire, Tire frontRightTire, Tire rearLeftTire, Tire rearRightTire) {// 금호금호금호한국, 금호 한한한 이 아닌 정해져있음
        this.frontLeftTire = frontTire;
        this.frontRightTire = frontRightTire;
        this.rearLeftTire = rearLeftTire;
        this.rearRightTire = rearRightTire;

    }


    void dirve() {
        System.out.println("자동차가 주행 중입니다.");
        frontLeftTire.roll();
        frontRightTire.roll();
        rearLeftTire.roll();
        rearRightTire.roll();

        System.out.println("주행 중에 앞왼쪽 바퀴가 고장이 났습니다.");
        frontLeftTire.broke();
        System.out.println("주행 중에 뒷왼쪽 바퀴가 고장이 났습니다.");
        rearLeftTire.broke();
    }
}



public class MyCarExample {
    public static void main(String[] args) {
        // 추상 클래스는 객체 생성 불가
        // Tire tire = new Tire("금호");

        KumhoTire frontLeft = new KumhoTire();
        KumhoTire frontRight = new KumhoTire();

        HanKookTire rearLeft = new HanKookTire();
        HanKookTire rearRight = new HanKookTire();

        MyCar myCar = new MyCar(frontLeft, frontRight, rearLeft, rearLeft);

        myCar.dirve();
    }

}
