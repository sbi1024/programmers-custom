package _java.level0;

public class Level0_저주의숫자3 {
    public static void main(String[] args) {
        int solution1 = solution(15);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(40);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0) {
                answer++;
            }
            while (true) {
                if((answer % 3 == 0) || String.valueOf(answer).contains("3")){
                    answer ++;
                }
                if(!((answer % 3 == 0) || String.valueOf(answer).contains("3"))){
                    break;
                }
            }
        }
        return answer;
    }
}
