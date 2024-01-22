package _java.level0;

import java.util.stream.IntStream;

public class Level0_팩토리얼 {
    public static void main(String[] args) {
        int solution1 = solution(3628800);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(7);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        return IntStream.rangeClosed(1, 10).filter(value1 -> factorial(value1) <= n).max().getAsInt();
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
