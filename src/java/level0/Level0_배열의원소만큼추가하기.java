package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_배열의원소만큼추가하기 {
    public static void main(String[] args) {
        int[] test1 = {5, 1, 4}; // [5, 5, 5, 5, 5, 1, 4, 4, 4, 4]
        int[] test2 = {6, 6}; // [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]
        int[] test3 = {1}; // [1]

        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
