
// 풀이 5 - String형 사용
public class Solution5 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i = 0; i < signs.length; i++) {
            if(signs[i]) {
                answer += absolutes[i];
            } else {
                String temp = "-" + absolutes[i];
                answer += Integer.parseInt(temp);
            }
        }

        return answer;
    }
}

