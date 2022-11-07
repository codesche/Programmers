// 직접 풀이한 소스 - 결과는 나오나 제출시 안 됨

public class Main {
    public String solution(String s) {
        String answer = "";
        String[] str_arr = s.split(" ");
        String tmp_str = "";

        for (int i = 0; i < str_arr.length; i++) {
            char[] ch = str_arr[i].toCharArray();

            if (Character.isLowerCase(ch[0])) {
                ch[0] = Character.toUpperCase(ch[0]);

                for (int j = 0; j < ch.length; j++) {
                    str_arr[i] = "";

                    if (Character.isUpperCase(ch[j]) && j != 0) {
                        ch[j] = Character.toLowerCase(ch[j]);
                    }

                    tmp_str += ch[j];
                }
                answer += (tmp_str + " ");
                tmp_str = "";
            } else {
                answer += (str_arr[i] + " ");
            }
        }

        // 문자열의 마지막 문자 제거하는 방법
        answer = answer.substring(0, answer.length() - 1);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();

//        System.out.println(T.solution("3people unFollowed me"));
        System.out.println(T.solution("for the last week"));

    }
}
