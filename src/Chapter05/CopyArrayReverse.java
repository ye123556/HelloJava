package Chapter05;

import java.util.Scanner;

public class CopyArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int n = sc.nextInt();
        int[] oldArray = new int[n];
        int[] newArray = new int[n];

        for (int i = 0; i < oldArray.length; i++) {
            System.out.print("a[" + i +"] = ");
            oldArray[i] = sc.nextInt();
        }

        // (직접 작성) 배열 oldArray의 모든 요소를 역순으로 newArray에 복사
        for (int i = 0; i < n; i++) { //oldArray.length
            // i = 0일때 newArray[0] = oldArray[3-0-1] // oldArray[oldArray.length-i-1]
            newArray[i] = oldArray[n-i-1];
        }

        System.out.println("oldArray의 모든 요소를 역순으로 복사했습니다.");
        PrintArray.printIntArray(newArray);
    }
}
