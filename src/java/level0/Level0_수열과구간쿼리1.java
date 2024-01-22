package java.level0;

import java.util.Arrays;

public class Level0_수열과구간쿼리1 {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 2, 3, 4};
        int[][] test2 = {{0, 1}, {1, 2}, {2, 3}};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test3 = {1, 2, 3, 4, 5};
        int[][] test4 = {{2, 4}};
        int[] solution2 = solution(test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][queries[i].length - 1]; j++) {
                arr[j]++;
            }
        }
        return arr;
    }
}
