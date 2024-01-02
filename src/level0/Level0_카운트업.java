package level0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Level0_카운트업 {
    public static void main(String[] args) {
        int[] solution1 = solution(3, 10);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int start_num, int end_num) {
        return IntStream.rangeClosed(start_num, end_num).toArray();
    }
}
