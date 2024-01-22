package _java.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_최댓값만들기1 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {0, 31, 24, 10, 1, 9};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] numbers) {
        List<Integer> list = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return list.get(0) * list.get(1);
    }
}
