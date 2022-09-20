class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);

            // 공백 처리
            if (ch == ' ') {
                answer += ch;
                continue;
            }

            // 소문자 처리
            if (ch >= 'a' && ch <= 'z') {
                answer = ((ch + n) > 'z') ? answer + (char)(ch - 26 + n) : answer + (char)(ch + n);
            } else if (ch >= 'A' && ch <= 'Z') {        // 대문자 처리
                answer = ((ch + n) > 'Z') ? answer + (char)(ch - 26 + n) : answer + (char)(ch + n);
            }
        }
        
        return answer;
    }
}
