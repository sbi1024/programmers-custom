package _java.level0;

import java.util.Arrays;

public class Level0_가장큰수찾기 {
    public static void main(String[] args) {
        int[] test1 = {1, 8, 3};
        int[] test2 = {9, 10, 11, 8};

        int[] solution1 = solution(test1);
        System.out.println("solution1 = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] array) {
        int[] answer = new int[2];

        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxIndex = i;
                maxValue = array[i];
            }
        }

        answer[0] = maxValue;
        answer[1] = maxIndex;

        return answer;
    }
}
