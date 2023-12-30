package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level0_순서바꾸기 {
    public static void main(String[] args) {
        int[] test1 = {2, 1, 6};
        int[] solution1 = solution(test1, 1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {5, 2, 1, 7, 5};
        int[] solution2 = solution(test2, 3);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] firstArray = Arrays.copyOfRange(num_list, n, num_list.length);
        int[] secondArray = Arrays.copyOfRange(num_list, 0, n);
        return IntStream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray)).toArray();
    }
}
