package _java.level2;

import java.util.Arrays;

public class Level2_행렬의곱셈 {
    public static void main(String[] args) {
//        int[][] test1 = {{1, 4}, {3, 2}, {4, 1}};
//        int[][] test2 = {{3, 3}, {3, 3}};
//        int[][] solution1 = solution(test1, test2);
//        System.out.println("Arrays.deepToString(solution1) = " + Arrays.deepToString(solution1)); // {{15, 15}, {15, 15}, {15, 15}}

        int[][] test3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] test4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] solution2 = solution(test3, test4);
        System.out.println("Arrays.deepToString(solution2) = " + Arrays.deepToString(solution2)); // {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}}
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            int sum = 0;
            // 반복문이 한번 더 들어가야 할 것 같다.
            for (int j = 0; j < arr1[i].length; j++) {
                int firstValue = arr1[i][j];
                int secondValue = arr2[j][i];
                sum += firstValue * secondValue;
            }
        }

        return answer;
    }
}
