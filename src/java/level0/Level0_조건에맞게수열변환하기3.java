package java.level0;

import java.util.Arrays;

public class Level0_조건에맞게수열변환하기3 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 100, 99, 98};
        int[] test2 = {1, 2, 3, 100, 99, 98};

        int[] solution1 = solution(test1, 3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, 2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] + k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                answer[i] = arr[i] * k;
            }
        }
        return answer;
    }
}
