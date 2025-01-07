package chapter02.lecture;

public class CastingExample {
    public static void main(String[] args) {
        // 수동 타입 변환 : int -> byte (다운 캐스팅)
        // 1 byte : -128 ~ 127 (byte byteValue = 128; 오류난다)
        byte byteValue = (byte) 128;
        System.out.println(byteValue);
        
        // 4 byte
        int intValue = 44032;
        // 2 byte ( 0~ 65,535 )
        // 양수의 경우 오버플로우, 음수의 경우 언더플로우 발생 가능성을 개발자가 감수해야 함 ( 수동 타입 변환 시)
        char charValue = (char) intValue; // intValue만 쓰면 오류. (char)작성해줘야한다.
        System.out.println("charValue = " + charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue; // (int)작성해야 오류안난다.
        System.out.println("doubleValue = " + doubleValue);

    }
}
