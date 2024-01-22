package _java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Level0_배열만들기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[][] test2 = {{1, 3}, {0, 4}};
        int[] solution1 = solution(test1, test2); // [2, 3, 4, 1, 2, 3, 4, 5]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            int[] tempArr = Arrays.copyOfRange(arr, interval[0], interval[1] + 1);
            list.add(tempArr);
        }
        return IntStream.concat(Arrays.stream(list.get(0)), Arrays.stream(list.get(1))).toArray();
    }
}
