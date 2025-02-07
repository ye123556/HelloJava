package Chapter10.lecture;
// 20250207
public class CatchByExceptionKindExample {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];

            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;

            System.out.println(data1 + " + " + data2 + " = " + result);
        }  // 예외 별로 예외 처리 코드를 다르게 하려면 다중 catch 볼록을 작성
        // catch 블록이 여러 개라 할지라도 단 하나의 블록만 실행
        // 예외를 처리해줄 블록은 위에서 부터 차례대로 검색
        // 다중 catch 블록을 작성할때 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해아 함
        /*catch (RuntimeException e) {
            System.out.println("실행 예외가 발생했습니다.");
        } */catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없습니다.");
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}
