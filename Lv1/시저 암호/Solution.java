
public class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length() ; i++) {
            char ch_arr = s.charAt(i);

            // 소문자 처리
            if (ch_arr >= 'a' && ch_arr <= 'z') {
                answer = ((ch_arr + n) > 'z') ? answer + (char)(ch_arr - 26 + n) : answer + (char)(ch_arr + n);
            } else if (ch_arr >= 'A' && ch_arr <= 'Z') {        // 대문자 처리
                answer = ((ch_arr + n) > 'Z') ? answer + (char)(ch_arr - 26 + n) : answer + (char)(ch_arr + n);
            } else if (ch_arr == ' ') {                         // 공백 처리
                answer += ch_arr;
            }
        }
        return answer;
    }
}
