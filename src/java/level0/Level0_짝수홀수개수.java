package java.level0;

import java.util.Arrays;

public class Level0_짝수홀수개수 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 3, 5, 7};

        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list) {
        int evenNumCount = (int) Arrays.stream(num_list).filter(value -> value % 2 == 0).count();
        int oddNumCount = (int) Arrays.stream(num_list).filter(value -> value % 2 != 0).count();
        return new int[]{evenNumCount, oddNumCount};
    }
}
