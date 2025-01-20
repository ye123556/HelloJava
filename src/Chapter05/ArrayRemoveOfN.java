package Chapter05;

import java.util.Scanner;

public class ArrayRemoveOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소 수:");
        int num = sc.nextInt();
        int[] intputArray = new int[num];

        // 요소 수 :num, num = length
        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]");
            intputArray[i] = sc.nextInt();
        }

        System.out.println("삭제를 시작할 인덱스:");
        int idx = sc.nextInt();

        System.out.println("삭제할 요소의 개수:");
        int n = sc.nextInt();

        int[] outputArray = arrayRmvOfN(intputArray, idx, n);

        PrintArray.printIntArray(outputArray);
    }

    public static int[] arrayRmvOfN(int[] array, int idx, int n) {
        if (n < idx || idx < 0 || idx >= array.length) {
            return array.clone();
        } else {
            if(idx + n >= array.length) {
                n= array.length - idx;
            }

            int[] newArr = new int[array.length-n];

            int i = 0;
            for(; i < idx; i++) {
                newArr[i] = array[i];
            }
            for (; i < array.length-n; i++) {
                newArr[i] = array[i +n];
            }
            return newArr;
        }
    }
}
