package java.level0;

public class Level0_홀짝에따라다른값반환하기 {
    public static void main(String[] args) {
        int solution1 = solution(7);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(10);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int answer = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += (int) Math.pow(i, 2);
                }
            }
        }
        return answer;
    }
}
