package level0;

import java.util.Arrays;

public class Level0_수열과구간쿼리3 {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 2, 3, 4};
        int[][] test2 = {{0, 3}, {1, 2}, {1, 4}};
        int[] solution1 = solution(test1, test2); // [3, 4, 1, 0, 2]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }
}
