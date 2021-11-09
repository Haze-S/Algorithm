package Day2;

// import java.util.*;

//class Solution {
//    public String solution(String[] seoul) {
//        int index = Arrays.binarySearch(seoul, "Kim");
//        String answer = "김서방은 " +index+"에 있다";
//        return answer;
//    }
//}

class Solution4 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }
}