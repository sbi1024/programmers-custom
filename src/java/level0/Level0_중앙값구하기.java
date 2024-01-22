package java.level0;

import java.util.Arrays;

public class Level0_중앙값구하기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 7, 10, 11};
        int[] test2 = {9, -1, 0};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] array) {
        int answer = 0;

        if (validArray(array)) {
            int[] sortArray = Arrays.stream(array).sorted().toArray();
            int centerIndex = (array.length / 2);
            answer = sortArray[centerIndex];

        }

        return answer;
    }

    public static boolean validArray(int[] array) {
        int arrayLength = array.length;
        if ((arrayLength % 2 == 0) || ((0 <= arrayLength) && (arrayLength >= 100))) {
            return false;
        }
        for (int arr : array) {
            if ((-1000 <= arr) && (arr >= 1000)) {
                return false;
            }
        }
        return true;
    }
}
