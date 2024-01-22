package java.level0;

public class Level0_짝수의합 {
    public static void main(String[] args) {
        int solution1 = solution(10);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(4);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
