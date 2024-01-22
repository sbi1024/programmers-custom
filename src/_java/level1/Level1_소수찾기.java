package _java.level1;

public class Level1_소수찾기 {
    public static void main(String[] args) {
        int solution1 = solution(10);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(5);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (checkPrimeNumber(i)) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean checkPrimeNumber(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
