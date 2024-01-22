package java.level1;

import java.util.Arrays;

public class Level1_예산 {
    public static void main(String[] args) {
        // TODO 이건 경우의 수 문제인줄 알았는데 아니었네 ? ..
        int[] test1 = {1, 3, 2, 5, 4};
        int[] test2 = {2, 2, 3, 3};
        int solution1 = solution(test1, 9);
        System.out.println("solution1 = " + solution1); // 3

        int solution2 = solution(test2, 10);
        System.out.println("solution2 = " + solution2); // 4
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for (int i : d) {
            budget -= i;
            if (budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
