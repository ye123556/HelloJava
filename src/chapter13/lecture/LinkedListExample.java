package chapter13.lecture;
// 20250211-09
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<>();

        long startTime, endTime;

        startTime = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            list1.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");

        startTime = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();

        System.out.println("ArrayList 걸린시간: " + (endTime-startTime) + "ns");
    }
}
