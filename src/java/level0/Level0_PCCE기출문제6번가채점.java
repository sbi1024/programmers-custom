package java.level0;

import java.util.Arrays;

public class Level0_PCCE기출문제6번가채점 {
    public static void main(String[] args) {
        int[] test1 = {1};
        int[] test2 = {100};
        int[] test3 = {100, 80, 90, 84, 20};
        String[] solution1 = solution(test1, test2, test3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // ["Same"]

        int[] test4 = {3, 4};
        int[] test5 = {85, 93};
        int[] test6 = {85, 92, 38, 93, 48, 85, 92, 56};
        String[] solution2 = solution(test4, test5, test6);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // ["Different", "Same"]
    }

    public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
