package java.level0;

import java.util.Arrays;

public class Level0_원소들의곱과합 {
    public static void main(String[] args) {

        int[] test1 = {3, 4, 5, 2, 1};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int[] test2 = {5, 7, 8, 3};
        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] num_list) {
        int multi = 1;
        for (int i = 0; i < num_list.length; i++) {
            multi *= num_list[i];
        }
        int sumPow = (int) Math.pow(Arrays.stream(num_list).sum(), 2);
        if (multi < sumPow) {
            return 1;
        } else {
            return 0;
        }
    }
}
