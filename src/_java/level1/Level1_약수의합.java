package _java.level1;

public class Level1_약수의합 {
    public static void main(String[] args) {
        int solution1 = solution(12);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(5);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(100);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer + n;
    }
}
