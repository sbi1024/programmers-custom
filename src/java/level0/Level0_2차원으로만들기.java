package java.level0;

import java.util.Arrays;

public class Level0_2차원으로만들기 {
    public static void main(String[] args) {
        // [1, 2, 3, 4, 5, 6, 7, 8]	2	[[1, 2], [3, 4], [5, 6], [7, 8]]
        // [100, 95, 2, 4, 5, 6, 18, 33, 948]	3	[[100, 95, 2], [4, 5, 6], [18, 33, 948]]
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] test2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};

        int[][] solution1 = solution(test1, 2);
        System.out.println("Arrays.deepToString(solution1) = " + Arrays.deepToString(solution1));

        int[][] solution2 = solution(test2, 3);
        System.out.println("Arrays.deepToString(solution2) = " + Arrays.deepToString(solution2));
    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[index];
                index++;
            }
        }
        return answer;
    }
}
