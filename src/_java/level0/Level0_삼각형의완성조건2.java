package _java.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level0_삼각형의완성조건2 {
    public static void main(String[] args) {
        int[] test1 = {1, 2};
        int[] test2 = {3, 6};
        int[] test3 = {11, 7};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2); // 5

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3); // 12
    }

    public static int solution(int[] sides) {
        int maxSides = Arrays.stream(sides).max().getAsInt();
        int minSides = Arrays.stream(sides).min().getAsInt();

        int result1 = (int) IntStream.rangeClosed(maxSides - minSides + 1, maxSides).count();
        int result2 = (int) IntStream.rangeClosed(maxSides + 1, maxSides + minSides - 1).count();

        return result1 + result2;
    }
}
