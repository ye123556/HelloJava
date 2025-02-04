package practice.example.entity;
//20250121
import java.util.Objects;

// 20250120-5
public class Seat extends BaseEntity {

    /*private long id; // 좌석 번호*/

    private static long counter = 0;

    private String description; // 설명

    public Seat(long id) {
        this.id = id;
        this.description = id + "번 좌석";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Seat seat)) return false;
        return id == seat.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
