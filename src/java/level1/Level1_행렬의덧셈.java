package java.level1;

import java.util.Arrays;

public class Level1_행렬의덧셈 {
    public static void main(String[] args) {
        // [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
        // [[1],[2]]	[[3],[4]]	[[4],[6]]
        int[][] test1 = {{1, 2}, {2, 3}};
        int[][] test2 = {{3, 4}, {5, 6}};
        int[][] solution1 = solution(test1, test2);
        System.out.println("Arrays.deepToString(solution1) = " + Arrays.deepToString(solution1));

        int[][] test3 = {{1}, {2}};
        int[][] test4 = {{3}, {4}};
        int[][] solution2 = solution(test3, test4);
        System.out.println("Arrays.deepToString(solution2) = " + Arrays.deepToString(solution2));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
