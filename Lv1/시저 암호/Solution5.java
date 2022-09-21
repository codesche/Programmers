

public class Solution {
    public String solution(String s, int n) {
        String answer = "";
        int i = 0;

        while(i < s.length()) {
            char ch_arr = s.charAt(i);
            
            if (Character.isLowerCase(ch_arr)) {
                ch_arr = (char) ((ch_arr - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch_arr)) {
                ch_arr = (char) ((ch_arr - 'A' + n) % 26 + 'A');
            }
            answer += ch_arr;
            System.out.println(answer);
        }
        return answer;
    }
}
