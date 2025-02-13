package chapter06.lecture;
//20250121
import java.util.Objects;

public class Seat {
    private int id;

    public Seat(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Seat)) return false;
        return id == ((Seat)o).id;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "name='" + id + '\'' +
                '}';
    }

}
