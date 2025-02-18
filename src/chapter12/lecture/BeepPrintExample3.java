package chapter12.lecture;
// 20250217
import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 시작");

        // 익명 구현 객체 > 람다식 변경
        Thread thread = new Thread(() -> {
            System.out.println("익명 작업 시작");
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for(int i=0; i<5; i++) {
                toolkit.beep();
                System.out.println("익명");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {}
            }
            System.out.println("익명 작업 종료");
        });

        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }

        System.out.println("메인 메소드 종료");
    }
}
