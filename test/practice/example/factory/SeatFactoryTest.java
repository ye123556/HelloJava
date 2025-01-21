package practice.example.factory;

import org.junit.jupiter.api.Test;
import practice.example.entity.Seat;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SeatFactoryTest {

    @Test
    void from() {
            List<Seat> seatList = SeatFactory.getSeats();

            seatList.clear();; // 리스트 초기화

            int countBefore = seatList.size(); // 길이0

            // 사용자 2명을 추가하였으나 중복 데이터로 1개만 추가가 되야함
            Seat seat1 = SeatFactory.from(1);
            Seat seat2 = SeatFactory.from(1);

            int countAfter = seatList.size();

            assertThat(countAfter).isEqualTo(countBefore + 1);
            assertThat(seat1).isSameAs(seat2);

        }
}