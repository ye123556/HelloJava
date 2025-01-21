package practice.example.factory;

import practice.example.entity.Seat;
import java.util.ArrayList;
import java.util.List;

public class SeatFactory {
    private  static final List<Seat> cache1 = new ArrayList<>();

    static {
        cache1.add(new Seat(2));
        cache1.add(new Seat(3));
        cache1.add(new Seat(4));
        cache1.add(new Seat(5));
        cache1.add(new Seat(6));
    }

    public static Seat from(int id) {
        Seat newSeat = new Seat(id);

        if (cache1.contains(newSeat)) {
            return cache1.get(cache1.indexOf(newSeat));
        } else {
            cache1.add(newSeat);
        }
        return newSeat;
    }

    public static List<Seat> getSeats() {
        return cache1;
    }
}
