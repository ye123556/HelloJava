package chapter02.lecture;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환 (다른 데이터 타입과의 연산을 수행하면 표현 범위가 넓은 쪽으로 자동 형변환이 수행)
        // 표현 크기가 작은 자료형을 큰 자료형에 대입하거나 연산이 발생할 때 컴파일러가 자동으로 타입을 변환
        // 1 byte
        byte byteValue =10;
        // 4 bite
        int intValue = /*(int)*/byteValue; // (int) 생략가능
        System.out.println("intValue = " + intValue); //soutv

        //2byte
        char charValue = '가';
        //4byte
        intValue = charValue;
        System.out.println("가의 유니코드 = " + intValue);

        // 4byte
        intValue = 50;
        // 8byte
        long longValue = /*(long)*/intValue;
        System.out.println("longValue= " + longValue);

        // 8byte
        longValue = 100;
        //4byte,float이 표현범위가 넓음
        float floatValue = longValue;
        System.out.println("floaValue = " + floatValue);

        // 4 byte
        floatValue = 100.5f;
        // 8 byte
        double doubleValue = floatValue;
        System.out.println("doubleValue = " + doubleValue); // soutv

        byte a = 10;
        byte b = 20;
        //byte +byte = int 자료형, short + short = int 자료형
        byte c = (byte) (a + b); // 바이트바이트는 int(byte c = (byte) + (a+b)
        // 변수가 아닌 정수형 리터럴로 입력하면 RightValue가 byte형으로 반환하도록 컴파일러가 자동 수행
        c = 10 + 20;

        System.out.println("c = " + c);
    }
}
