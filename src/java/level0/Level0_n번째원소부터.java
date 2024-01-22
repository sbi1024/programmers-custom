package java.level0;

import java.util.Arrays;

public class Level0_n번째원소부터 {
    public static void main(String[] args) {
        int[] test1 = {2, 1, 6};
        int[] solution1 = solution(test1, 3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {5, 2, 1, 7, 5};
        int[] solution2 = solution(test2, 2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
