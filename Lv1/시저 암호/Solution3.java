

public class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            // 문자열을 문자배열로 재구성
            char ch_arr = s.charAt(i);

            // 소문자 조건 처리 - 일반 로직 : else문, 조건 고려 로직 : if문으로 처리
            if (ch_arr >= 'a' && ch_arr <= 'z') {
                if (ch_arr + n > 'z') {
                    answer += (char)(ch_arr - 26 + n);
                } else {
                    answer += (char)(ch_arr + n);
                }
            } else if (ch_arr >= 'A' && ch_arr <= 'Z') {
                // 대문자 조건 처리 - 일반 로직 : else문, 조건 고려 로직 : if문으로 처리
                if (ch_arr+ n > 'Z') {
                    answer += (char)(ch_arr - 26 + n);
                } else {
                    answer += (char)(ch_arr + n);
                }
            } else if (ch_arr == ' ') {
                // 공백 처리
                answer += ch_arr;
            }
        }
        return answer;
    }
}

