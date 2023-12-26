package level0;

public class Level0_주사위게임1 {
    public static void main(String[] args) {
        int solution1 = solution(3, 5);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(6, 1);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(2, 4);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int a, int b) {
        // 1. a,b 가 모두 홀수인 경우
        if (a % 2 != 0 && b % 2 != 0) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        }
        // 2. a,b 중 하나만 홀수인 경우
        else if (a % 2 != 0 || b % 2 != 0) {
            return 2 * (a + b);
        }
        // 3. a,b 모두 홀수가 아닌 경우
        else {
            return Math.abs(a - b);
        }
    }
}
