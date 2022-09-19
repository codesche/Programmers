// 풀이 3 - 삼항 연산자 활용한 풀이방법
public class Solution3 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i] ? 1: -1);
        }
        return answer;
    }
}
