package practice;
//20250123
import java.util.ArrayList;
import java.util.Comparator;

class Solution {

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>(); // 래퍼클래스

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        if(answer.size() == 0)
            answer.add(-1);
        // arrayList.sort(), Comparator
        answer.sort(Comparator.naturalOrder());// 오름차순 정렬

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

