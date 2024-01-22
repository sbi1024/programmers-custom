package _java.level0;

import java.util.Arrays;

public class Level0_n의배수고르기 {
    public static void main(String[] args) {
        int test1 = 3;
        int test2 = 5;
        int test3 = 12;

        int[] test4 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] test5 = {1, 9, 3, 10, 13, 5};
        int[] test6 = {2, 100, 120, 600, 12, 12};

        int[] solution1 = solution(test1, test4); // [6, 9, 12]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
        int[] solution2 = solution(test2, test5); // [10, 5]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
        int[] solution3 = solution(test3, test6); // [120, 600, 12, 12]
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(value -> (value % n == 0)).toArray();
    }
}
