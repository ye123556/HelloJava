package Chapter10.lecture;
// 20250207
public class RuntimeExceptionExample {
    public static void main(String[] args) {

        // args = new String[]{"123"};
        // args = new String[]{"123", "일이삼"};
        // args = new String[]{"123", "456"}; // 이것만 더해짐 나머지는 불가능


        String data1 = null;
        String data2 = null;

        try {
            data1 = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) { // 실행 예외, 예외 처리 자유
            System.out.println("실행 매개값의 수가 부족합니다.");
            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 + " + " + data2 + " = " + result);
        } catch (NumberFormatException e) { // 실행 예외
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}
