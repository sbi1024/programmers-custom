package _java.level0;

import java.util.Arrays;

public class Level0_특이한이차원배열1 {
    public static void main(String[] args) {
        int[][] solution1 = solution(3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.deepToString(solution1));

        int[][] solution2 = solution(6);
        System.out.println("Arrays.toString(solution2) = " + Arrays.deepToString(solution2));

        int[][] solution3 = solution(1);
        System.out.println("Arrays.toString(solution3) = " + Arrays.deepToString(solution3));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }

}
