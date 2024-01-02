package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level0_배열만들기1 {
    public static void main(String[] args) {
        int[] solution1 = solution(10, 3); // [3, 6, 9]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(15, 5); // [5, 10, 15]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(value -> value % k == 0).toArray();
    }
}
