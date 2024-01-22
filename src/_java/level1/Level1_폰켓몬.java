package _java.level1;

import java.util.Arrays;

public class Level1_폰켓몬 {
    public static void main(String[] args) {
        int[] test1 = {3, 1, 2, 3};
        int[] test2 = {3, 3, 3, 2, 2, 4};
        int[] test3 = {3, 3, 3, 2, 2, 2};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] nums) {
        long numDistinctCount = Arrays.stream(nums).boxed().distinct().count();
        int numLengthDivideTwo = nums.length / 2;
        if (numDistinctCount > numLengthDivideTwo) {
            return numLengthDivideTwo;
        } else {
            return (int) numDistinctCount;
        }
    }
}
