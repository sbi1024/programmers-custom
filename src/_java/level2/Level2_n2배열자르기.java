package _java.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level2_n2배열자르기 {
    public static void main(String[] args) {
        int[] solution1 = solution(3, 2, 5);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [3,2,2,3]

        int[] solution2 = solution(4, 7, 14);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [4,3,3,3,4,4,4,4]
    }

    public static int[] solution(int n, long left, long right) {
        long[][] tempArray1 = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tempArray1[i][j] = Math.max(i, j) + 1;
            }
        }

        System.out.println("Arrays.deepToString(tempArray1) = " + Arrays.deepToString(tempArray1));
        // 1(0,0) 2(0,1) 3(0,2) 2(1,0) 2(1,1) 3(1,2) 3(2,0) 3(2,1) 3(2,2)

        List<Long> list = new ArrayList<>();
        for (long[] temp : tempArray1) {
            for (long value : temp) {
                list.add(value);
            }
        }

        List<Long> subList = list.subList((int) left, (int) right + 1);
        return subList.stream().mapToInt(Long::intValue).toArray();
    }
}
