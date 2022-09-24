import java.time.LocalDate;
import java.time.DayOfWeek;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] arr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        // 연월일 확인
        LocalDate date = LocalDate.of(2016, a, b);
      
        // DayOfWeek 객체 구하기 (요일을 표현하는 DayOfWeek Enum을 가져옴)
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // 요일을 숫자로 반환
        int dayOfWeekNumber = dayOfWeek.getValue();

        switch(dayOfWeekNumber) {
            case 1:
                answer = "MON";
                break;
            case 2:
                answer = "TUE";
                break;
            case 3:
                answer = "WED";
                break;
            case 4:
                answer = "THU";
                break;
            case 5:
                answer = "FRI";
                break;
            case 6:
                answer = "SAT";
                break;
            case 7:
                answer = "SUN";
                break;
            default:
        }

        return answer;
    }
}
