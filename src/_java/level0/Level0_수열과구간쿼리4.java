package _java.level0;

import java.util.Arrays;

public class Level0_수열과구간쿼리4 {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 2, 4, 3};
        int[][] test2 = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] solution1 = solution(test1, test2); // [3, 2, 4, 6, 4]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (i % query[2] == 0) {
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}
