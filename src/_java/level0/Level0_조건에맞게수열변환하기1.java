package _java.level0;

import java.util.Arrays;

public class Level0_조건에맞게수열변환하기1 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 100, 99, 98};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
}
