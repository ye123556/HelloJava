package practice.example.entity;
// 20250205
import practice.example.entity.base.BaseEntity;

import java.util.ArrayList;
import java.util.List;

public class Seat extends BaseEntity {

    private static long counter = 0;

    public static final List<Seat> SEAT_LIST = new ArrayList<>();

    private static final int numberOfSeats = 20;

    static {
        for (int i = 1; i <= numberOfSeats ; i++) {
            SEAT_LIST.add(new Seat(i));
        }
    }

    private String description; // 설명

    public Seat(long id) {
        this.id = id;
        this.description = id + "번 좌석";
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat seat)) return false;

        return id == seat.id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }
}

