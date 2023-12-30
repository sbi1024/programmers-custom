package level0;

import java.util.Arrays;

public class Level0_n번째원소까지 {
    public static void main(String[] args) {
        int[] test1 = {2, 1, 6};
        int[] test2 = {5, 2, 1, 7, 5};

        int[] solution1 = solution(test1, 1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, 3);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        System.arraycopy(num_list, 0, answer, 0, n);
        return answer;
    }
}
