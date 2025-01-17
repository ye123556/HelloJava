package Chapter05;
//20250117
import java.util.Scanner;

// 배열 삽입 및 리턴
public class ArraylnsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수:");
        int num =sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("x[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        System.out.println("삽입할 인덱스:");
        int idx = sc.nextInt();

        System.out.println("삽입할 값:");
        int value = sc.nextInt();

        int[] outputArray = arrayInsOf(inputArray, idx, value);
        PrintArray.printIntArray(outputArray);
    }

    private static int[] arrayInsOf(int[] inputArray, int idx, int value) {
        int[] b = new int[inputArray.length+1];
        int a = 0;
        if (idx >= 0 && idx < inputArray.length) {
            for (int i = 0; i < inputArray.length+1; i++) {
                if (i == idx) {
                    b[i] = value;
                    a--;
                }else {
                    b[i] = inputArray[a];
                }
                a++;

            }
        }
        return b;
    }
}
