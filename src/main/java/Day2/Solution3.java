package Day2;

import java.util.ArrayList;
import java.util.Arrays;

class Solution3 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> solution = new ArrayList<Integer>(); // solution을 integer타입 Arraylist로 선언
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % divisor == 0){ //
                solution.add(arr[i]);
            }
        }
        if (solution.isEmpty()){  // for문을 돌려 나온 solution이 비어있으면 -1을 추가
            solution.add(-1);
        }
        answer = new int[solution.size()]; // answer의 크기를 solution과 맞춤
        for(int j =0; j<answer.length; j++){
            answer[j] = solution.get(j); // solution의 원소를 answer에 저장
        }
        Arrays.sort(answer); // 오름차순 정렬

        return answer;
    }
}

//class Solution {
//    public int[] solution(int[] arr, int divisor) {
//        return Arrays.stream(arr).filter(element -> element%divisor==0).toArray();
//    }
//}
