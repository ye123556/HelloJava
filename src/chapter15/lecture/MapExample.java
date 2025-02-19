package chapter15.lecture;
// 20250219
import Chapter05.PrintArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    // 숫자의 리스트에서 각 숫자를 제곱하는 예제
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3, 4, 5};

        List<Integer> number = Arrays.stream(arr) // int 배열을 IntStream으로 변환
                .boxed() // IntStream을 integer로 박싱
                .collect(Collectors.toList());*/ // int 배열을 ArrayList 형태로 반환

        int[] arr = {1, 2, 3, 4, 5};

        // 제곱한 값을 int[] 배열로 반환
        int[] squaredArr = Arrays.stream(arr)
                .map(n -> n * n)
                .toArray();
        System.out.println("int[] 배열!!!");
        PrintArray.printIntArray(squaredArr);

        // List 형태
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumbers = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("List<Integer> 컬렉션!!!");
        System.out.println("Squared Numbers: " + squaredNumbers);
    }

    public static void main() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i] * arr[i];
        }

        PrintArray.printIntArray(newArray);
    }
}
