package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_콜라츠수열만들기 {
    public static void main(String[] args) {
        int[] solution1 = solution(10);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(1);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
