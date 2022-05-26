//2번. 자연수 뒤집어 더하기
//    자연수 n의 각 자리 숫자를 뒤집은 순서로 더해 출력하는 수식을 리턴해주세요. 예를들어 n이 12345이면 "5+4+3+2+1=15" 라는 문자열을 리턴합니다.
//
//    제한 조건
//    N의 범위 : 100,000,000 이하의 자연수

public class Main {
    public String solution(int n) {
        String answer = "";
        int reverse = 0;
        int sum = 0;

        // 입력받은 숫자를 역순으로 정렬하기
        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        // int -> Sting
        String stRev = Integer.toString(reverse);

        // n이 0이 아닐때
        while (reverse != 0) {
            // reverse의 숫자를 10으로 나눴을때 나머지 더하기
            sum = reverse % 10 + sum;
            // 마지막 숫자가 10 보다 작으면 break
            if (reverse < 10) {
                break;
            }
            reverse = reverse / 10;
        }

        // answer에 한 숫자씩 잘라서 추가
        for (int i = 0; i < stRev.length(); i++) {
            answer += stRev.charAt(i) + "+";
            // i가 문자형 역순의 마지막일때
            if (i == stRev.length() - 1) {
                // 추가되어있는 + 제거
                answer = answer.substring(0, answer.length() - 1);
                // =를 추가하고 총합 추가
                answer += "=" + sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        System.out.println(method.solution(1532576));
    }
}