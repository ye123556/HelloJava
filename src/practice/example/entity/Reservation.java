package practice.example.entity;
// 20250120-8

import java.time.LocalDateTime;

public class Reservation extends BaseEntity{
   /* private long id;*/
    private static long counter = 0;
    // 예약자
    private User user;

    //예약 좌석
    private Seat seat;

    // 시작 시간
    private LocalDateTime startTime;

    // 종료시간
    private LocalDateTime endTime;

    public Reservation(User user, Seat seat, LocalDateTime startTime, LocalDateTime endTime) {
        this.user = user;
        this.seat = seat;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "user=" + user +
                ", seat=" + seat +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
