package java.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level0_약수구하기 {
    public static void main(String[] args) {
        int[] solution1 = solution(24);
        System.out.println("solution1 = " + Arrays.toString(solution1));

        int[] solution2 = solution(29);
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }

    public static int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(value -> n % value == 0).toArray();
    }
}
