package _java.level0;

import java.util.Arrays;

public class Level0_배열의길이를2의거듭제곱으로만들기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {58, 172, 746, 89};
        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] test3 = {};
        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        int[] test4 = {1};
        int[] solution4 = solution(test4);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));
    }

    public static int[] solution(int[] arr) {
        int answerLength = 1;
        int arrLength = arr.length;
        while (answerLength < arrLength) {answerLength *= 2;}
        int[] answer = new int[answerLength];
        System.arraycopy(arr, 0, answer, 0, arrLength);
        return answer;
    }

    public static int[] solution1(int[] arr) {
        int count = 1;
        int arrLength = arr.length;
        while (Math.pow(2, count) < arrLength) {
            count++;
        }
        int mathPow = (int) Math.pow(2, count);
        if (arrLength == 0 || arrLength == 1) {
            mathPow = 1;
        }
        int[] answer = new int[mathPow];

        System.arraycopy(arr, 0, answer, 0, arrLength);
        return answer;
    }


}
