package Chapter05;
//20250117
import java.util.Scanner;

public class ArrayRemoveOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요소 수:");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("x[" + i + "]:");
            inputArray[i] = sc.nextInt();
        }

        System.out.println("삭제할 요소의 인덱스 :");
        int idx = sc.nextInt();

        int[] outputArray = arrayRmvOf(inputArray, idx); // 배열에서 해당 인덱스의 값 삭제하고, 새로 만든 배열을 리턴

        PrintArray.printIntArray(outputArray);
    }

    public static int[] arrayRmvOf(int[] arr, int idx) {

        if (0 < idx || idx >= arr.length)
            return arr.clone();
        else {
            int[] newArr = new int[arr.length-1];
            int i = 0;

            for (; i < idx; i++) {
                    newArr[i] = arr[i];
            }
            // i = idx; 근데 우리는 i를 새로 만든 배열 기준으로 쓸거야
            for(; i<arr.length-1; i++)
                newArr[i] = arr[i+1];

            return  newArr;
        }
    }
}
