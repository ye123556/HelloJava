package chapter11.lecture;
// 20250210- 오후
public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        // 자동 박싱
        Integer obj = 100;
        System.out.println("value: " + obj.intValue()); // obj로 출력해도 같은 결과가 나옴

        // 대입 시 자동 언박싱
        int value = obj;
        System.out.println("value: " + value);

        // 연산 시 자동 언박싱
        int result = obj + 100;
        System.out.println("result: " + result);
    }
}
