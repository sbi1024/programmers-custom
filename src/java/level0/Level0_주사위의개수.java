package java.level0;

import java.util.Arrays;

public class Level0_주사위의개수 {
    public static void main(String[] args) {
        int[] test1 = {1, 1, 1};
        int[] test2 = {10, 8, 6};

        int solution1 = solution(test1, 1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, 3);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] box, int n) {
        int answer = 1;
        int[] modArray = Arrays.stream(box).map(value -> value / n).toArray();
        for (int mod : modArray) {
            answer *= mod;
        }
        return answer;
    }
}
