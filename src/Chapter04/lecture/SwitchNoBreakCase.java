package Chapter04.lecture;

public class SwitchNoBreakCase {
    public static void main(String[] args) {
        // 8시 ~ 11시 사이의 난수
        int time = (int) (Math.random() * 4) + 8;
        System.out.println("[현재 시각: " + time + "시]");

        switch (time) {
            case 8:
                System.out.println("출근합니다.");
            case 9:
                System.out.println("회의합니다.");
            case 10:
                System.out.println("업무합니다.");
            default:
                System.out.println("외근합니다.");
        }
    }
}
