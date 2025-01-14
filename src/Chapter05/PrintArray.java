package Chapter05;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

    }
    public static void printIntArray(int[] array) {
        System.out.print("{");

        // 마지막 요소를 제외한 앞 요소 출력
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + ",");
        }

        // 빈 배열의 경우 길이가 0이므로 array[-1]에 접근하므로 조건 설정 필요
        if (array.length >= 1) {
            System.out.print(array[array.length - 1]);
        }

        System.out.print("}");

    }

    public static void printDoubleArray(double[] array) {
    }
}
