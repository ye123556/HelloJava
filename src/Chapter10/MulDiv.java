package Chapter10;
// 20250207
import java.util.InputMismatchException;
import java.util.Scanner;

public class MulDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("x값:");
            int x = sc.nextInt(); // 실행 예외 : 우리는 int를 예상하지만 사용자가 어떤 값을 입력할지 모름...
            System.out.print("y값:");
            int y = sc.nextInt(); // x에 "ABC"가 입력되면 런타임 오류가 발생, InputMismatchException

            System.out.println("x * y = " + x * y);
            System.out.println("x / y = " + x / y); // case 2 : y에 0을 입력하면 런타임 오류가 발생, ArithmeticException

        } catch (InputMismatchException e) {
            System.out.println("입력 오류 발생." + e);
            e.printStackTrace(); // "이부분 보기"
        } catch (ArithmeticException e) {
            System.out.println("산술 오류 발생." + e);
            e.printStackTrace();
        }finally {
            System.out.println("프로그램을 종료합니다");
        }
    }
}
