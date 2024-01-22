package java.level0;

import java.util.Arrays;

public class Level0_아이스아메리카노 {
    public static void main(String[] args) {
        int[] solution1 = solution(5500);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(15000);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int money) {
        int[] answer = new int[2];
         answer[0] = money / 5500;
         answer[1] = money % 5500;
        return answer;
    }
}
