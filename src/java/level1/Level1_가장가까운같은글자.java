package java.level1;

import java.util.Arrays;

public class Level1_가장가까운같은글자 {
    public static void main(String[] args) {
        int[] solution1 = solution("banana"); // [-1, -1, -1, 2, 2, 2]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
        int[] solution2 = solution("foobar"); // [-1, -1, 1, -1, -1, -1]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(String s) {
        char[] charArray = s.toCharArray();
        int charLength = charArray.length;
        int[] answer = new int[charLength];
        for (int i = 0; i < charLength; i++) answer[i] = -1;

        for (int i = charLength - 1; i >= 0; i--) {
            int standValue = charArray[i] - 'a';
            for (int j = i - 1; j >= 0; j--) {
                int anotherValue = charArray[j] - 'a';
                if (standValue == anotherValue) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}
