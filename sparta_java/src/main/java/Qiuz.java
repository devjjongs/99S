
// 2번. 신대륙 발견
// 예지는 오늘 항해99를 시작했다. 성격이 급한 예지는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
// 항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.

// 제한 조건
// 1 ≤ month ≤ 12
// 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)

// 입출력 예
// month / day /  result
//   11  / 27  / “3월 5일”
//   6   / 22  / “9월 28일”

// 지정입력값
// month / day /  result
//   1   /  18 / "4월 26일"

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Qiuz {
    public String solution(int month, int day) {
        String answer = "";

        // 표현되는 날짜 포멧 설정
        SimpleDateFormat sdf = new SimpleDateFormat("M월 d일");

        // 입력받는 날짜로 시작일을 세팅        
        Calendar stDay = Calendar.getInstance();
        stDay.set(2022, month-1, day);

        // 세팅된 시작 날짜에 98을 더해서 수료일을 구함
        System.out.println(sdf.format(stDay.getTime()));
        stDay.add(Calendar.DATE, 98);
        answer = sdf.format(stDay.getTime());

        return answer;
    }

    public static void main(String[] args) {
        Qiuz method = new Qiuz();
        System.out.println(method.solution(1, 18));
    }
}