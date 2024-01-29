package _java.level2;

import java.util.Arrays;

public class Level2_행렬의곱셈 {
    // TODO 다시 생각하고 다시 풀것
    public static void main(String[] args) {
        int[][] test1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] test2 = {{3, 3}, {3, 3}};
        int[][] solution1 = solution(test1, test2);
        System.out.println("Arrays.deepToString(solution1) = " + Arrays.deepToString(solution1)); // {{15, 15}, {15, 15}, {15, 15}}

        int[][] test3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] test4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] solution2 = solution(test3, test4);
        System.out.println("Arrays.deepToString(solution2) = " + Arrays.deepToString(solution2)); // {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];


        return answer;
    }
}
