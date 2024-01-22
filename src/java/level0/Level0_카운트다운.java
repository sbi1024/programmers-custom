package java.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Level0_카운트다운 {
    public static void main(String[] args) {
        int[] solution1 = solution(10, 3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int start, int end_num) {
        return IntStream.rangeClosed(end_num, start)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
