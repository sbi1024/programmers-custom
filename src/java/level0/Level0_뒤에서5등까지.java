package java.level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Level0_뒤에서5등까지 {
    public static void main(String[] args) {
        int[] test1 = {12, 4, 15, 46, 38, 1, 14};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] num_list) {
        return Arrays.stream(num_list)
                .boxed()
                .sorted()
                .collect(Collectors.toList())
                .subList(0, 5)
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
