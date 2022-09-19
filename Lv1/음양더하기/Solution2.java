
// 풀이 2 - for문 하나 + if ~ else if
public class Solution2 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        // 배열길이
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true){
                answer += absolutes[i];
            } else if (signs[i] == false) {
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}

