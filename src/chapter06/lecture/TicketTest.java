package chapter06.lecture;
// 20250120-2
/*public*/class Ticket { // 티켓 클래스 생성, 현실의 티켓 모델링
    private long fee = 1000L; // 인스턴스 필드, 티켓 요금

    public String createAt = "2025년 1월 20일 10시 30분";

    public long getFee() { // 카멜케이스라서 Fee
        return fee;
    }

    public void setFee(long fee) { // 넘기는 것 - TicketTest 15
        this.fee = fee;
    }
}

public class TicketTest {
    public static void main(String[] args) {


        // 티켓 객체 생성
        Ticket ticket = new Ticket();

        long localValue = ticket.getFee(); // 힙 영역의 값을 스택 변수에 값 복사

        System.out.println("지역변수 값 : " + localValue); // 1000
        System.out.println("인스턴스 변수 값 : " + ticket.getFee()); // 1000

        ticket.setFee(2000L); // 티켓 가격 변경 (힙메모리)

        System.out.println("지역변수 값 : " + localValue); // 1000
        System.out.println("인스턴스 변수 값 : " + ticket.getFee()); // 2000

        localValue = 2000L; // 티켓 가격 변경 (스택 메모리)
        System.out.println("지역변수 값 : " + localValue); // 2000
        System.out.println("인스턴스 변수 값 : " + ticket.getFee()); // 2000

        System.out.println(ticket.createAt);
    }
}
