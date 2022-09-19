//여러 방법으로 풀이

// 풀이 1 - for문 + if ~ else문 활용
public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        // 이건 생각해 냄, if문까지는 생각 못함
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }

        return answer;
    }
}
