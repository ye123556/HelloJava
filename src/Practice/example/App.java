package Practice.example;

import Practice.example.entitiy.Reservation;
import Practice.example.entitiy.Seat;
import Practice.example.entitiy.User;

import java.time.LocalDateTime;

// 20250120-7
public class App {
    public static void main(String[] args) {
        // 사용자 생성
        User[] users = new User[4];

        users[0] = new User("윤하겸", "010-0000-0000");
        users[1] = new User("박세빈", "010-0000-0001");
        users[2] = new User("유근규", "010-0000-0002");
        users[3] = new User("이유나", "010-0000-0003");
        // 이미 가입된 객체가 또 새로 생설될 수 있음. 객체 생성을 관리할 뭔가가 필요함
        // User user5 =new User("이유나", "010-0000-0003");

        for (User user : users) {
            System.out.println(user);
        }
        // 좌석 8개 생성
        Seat[] seats = new Seat[8];

        for (int i = 0; i < 8; i++) {
            seats[i] = new Seat(i+1);

            System.out.println(seats[i]);
        }
        /*Seat seat1 = new Seat(1);
        Seat seat2 = new Seat(2);
        Seat seat3 = new Seat(3);
        Seat seat4 = new Seat(4);*/

        // 예약 2개 생성
        Reservation[] reservations = new Reservation[2];


        // LocalDateTime.parse(), ISO-8601 형식 (예 : yyyy-MM-dd'T'HH:mm:ss
        reservations[0] = new Reservation(users[0], seats[1],
                LocalDateTime.parse("2025-01-20T15:30:45"), LocalDateTime.parse("2025-01-20T16:30:45"));
        reservations[1] = new Reservation(users[1], seats[2],
                LocalDateTime.parse("2025-01-20T15:30:45"), LocalDateTime.parse("2025-01-20T16:30:45"));
        System.out.println(reservations[0]);
        System.out.println(reservations[1]);
    }
}