package level0;

import java.util.Arrays;

public class Level0_수열과구간쿼리2 {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 2, 4, 3};
        int[][] test2 = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            int minValue = Integer.MAX_VALUE;
            for (int i = queries[j][0]; i <= queries[j][1]; i++) {
                if (arr[i] > queries[j][2]) {
                    if (arr[i] < minValue) {
                        minValue = arr[i];
                    }
                }
            }
            if (minValue == Integer.MAX_VALUE) {
                answer[j] = -1;
            } else {
                answer[j] = minValue;
            }
        }
        return answer;
    }
}
