package chapter12.lecture;
// 20250217
class PrintThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("실행 중");

            // 인터럽트 발생 시 스레닥 종료되도록 설계
            if (this.isInterrupted()) break;
        }
    }
}
public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}