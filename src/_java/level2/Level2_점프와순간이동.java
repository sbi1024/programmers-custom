package _java.level2;

public class Level2_점프와순간이동 {
    public static void main(String[] args) {
        int solution1 = solution(5);
        System.out.println("solution1 = " + solution1); // 2

        int solution2 = solution(6);
        System.out.println("solution2 = " + solution2); // 2

        int solution3 = solution(5000);
        System.out.println("solution3 = " + solution3); // 5
    }

    public static int solution(int n) {
        int ans = 1;

        while (n != 1) {
            if (n % 2 != 0) {
                n -= 1;
                ans++;
            }
            n /= 2;
        }

        return ans;
    }
}
