package _java.level2;

import java.util.Arrays;

public class Level2_이진변환반복하기 {
    public static void main(String[] args) {
        int[] solution1 = solution("110010101001");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // 3,8

        int[] solution2 = solution("01110");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // 3,3

        int[] solution3 = solution("1111111");
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // 4,1
    }

    public static int[] solution(String s) {
        int removeZeroCount = 0;
        int convertCount = 0;

        while (!s.equals("1")) {
            String replaceOneToEmpty = s.replaceAll("[^1-9]", "");
            int originalLength = s.length();
            int replaceOneToEmptyLength = replaceOneToEmpty.length();
            int zeroCount = originalLength - replaceOneToEmptyLength;
            removeZeroCount += zeroCount;

            s = Integer.toString(replaceOneToEmptyLength, 2);
            convertCount++;
        }

        int[] answer = new int[2];
        answer[0] = convertCount;
        answer[1] = removeZeroCount;

        return answer;
    }
}
