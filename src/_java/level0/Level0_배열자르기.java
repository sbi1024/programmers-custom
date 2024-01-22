package _java.level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level0_배열자르기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 3, 5};

        int[] solution1 = solution(test1, 1, 3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, 1, 2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2).map(num -> numbers[num]).toArray();
    }
}
