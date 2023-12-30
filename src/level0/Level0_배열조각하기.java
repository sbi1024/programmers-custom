package level0;

import java.util.Arrays;

public class Level0_배열조각하기 {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 2, 3, 4, 5};
        int[] test2 = {4, 1, 2};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [1, 2, 3]
    }

    public static int[] solution(int[] arr, int[] query) {
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}
