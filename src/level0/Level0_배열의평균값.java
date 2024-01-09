package level0;

import java.util.Arrays;

public class Level0_배열의평균값 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] test2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        double solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        double solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
