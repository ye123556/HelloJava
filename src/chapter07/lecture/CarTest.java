package chapter07.lecture;
// 20250203-4
//import chapter07.Car;

public class CarTest {
    public static void main(String[] args) {

        // List<Integer> integerList = new LinkedList<>();

        Car sportsCar = new SportsCar();

        System.out.println("speed initValue : " + sportsCar.speed);
        //System.out.println("speed initValue : " + sportsCar.isCoupe); // 자식것은 접근 불가능

        sportsCar.speedUp();
    }
}
