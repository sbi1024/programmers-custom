package _java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_제일작은수제거하기 {
    public static void main(String[] args) {
        int[] test1 = {4, 3, 2, 1}; //[4,3,2]
        int[] test2 = {10}; // [-1]

        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int minValue = Arrays.stream(arr).min().getAsInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minValue) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
