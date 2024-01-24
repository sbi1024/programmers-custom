package _java.level2;

import java.time.Year;
import java.util.Arrays;

public class Level2_카펫 {
    public static void main(String[] args) {
        int[] solution1 = solution(10, 2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [4, 3]

        int[] solution2 = solution(8, 1);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [3, 3]

        int[] solution3 = solution(24, 24);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // [8, 6]

        int[] solution4 = solution(18, 6);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4)); // [8, 3]
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int area = brown + yellow;
        int width = -1;
        int length = -1;

        for (int i = 1; i <= area; i++) {
            width = i;
            length = area / i;
            if ((area % i == 0) && i >= length) {
                if ((width - 2) * (length - 2) == yellow) {
                    break;
                }
            }
        }

        answer[0] = width;
        answer[1] = length;

        return answer;
    }
}
