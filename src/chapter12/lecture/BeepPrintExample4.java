package chapter12.lecture;
// 20250217
import java.awt.*;

class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for(int i=0; i<5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}

public class BeepPrintExample4 {
    public static void main(String[] args) {
        // 익명 객체로 변경
        // Thread thread = new BeepThread();
        Thread thread = new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }
            }
        };

        thread.start();

        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
}
