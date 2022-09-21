

public class Solution {
    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            // 대문자인 경우
            if (arr[i] >= 'A' && arr[i] <= 'Z')  {
                arr[i] = (char)(arr[i] + n);

                if (arr[i] > 'Z') {
                    arr[i] = (char)(arr[i] - 26);
                }
            } else if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] + n);

                if (arr[i] > 'z') {
                    arr[i] = (char)(arr[i] - 26);
                }
            }
        }
        answer = new String(arr);
        return answer;
    }
}

