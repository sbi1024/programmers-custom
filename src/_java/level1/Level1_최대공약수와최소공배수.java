package _java.level1;

import java.util.Arrays;

public class Level1_최대공약수와최소공배수 {
    public static void main(String[] args) {
        // TODO 최대공약수와 최소공배수의 개념 재 확립 필요

        int[] solution1 = solution(3, 12);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [3, 12]

        int[] solution2 = solution(2, 5);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [1, 10]

        int[] solution3 = solution(100, 24);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // [1, 10]
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        if (n > m) {
            answer[0] = gcd(n, m);
            answer[1] = lcm(n, m);
        } else {
            answer[0] = gcd(m, n);
            answer[1] = lcm(m, n);
        }
        return answer;
    }

    public static int gcd(int n, int m) {
        if (n % m == 0) return m;
        return gcd(m, n % m);
    }

    public static int lcm(int n, int m) {
        return (n * m / gcd(n, m));
    }
}
