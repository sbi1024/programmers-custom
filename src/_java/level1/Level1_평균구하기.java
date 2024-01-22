package _java.level1;

import java.util.Arrays;

public class Level1_평균구하기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {5, 5};

        double solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        double solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
