package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_연속된수의합 {
    public static void main(String[] args) {
        int[] solution1 = solution(3, 12);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(5, 15);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(4, 14);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        int[] solution4 = solution(5, 5);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));

        int[] solution5 = solution(5, 0);
        System.out.println("Arrays.toString(solution5) = " + Arrays.toString(solution5)); // [-2, -1, 0, 1, 2]
    }

    public static int[] solution(int num, int total) {
        List<Integer> indexList = new ArrayList<>();
        int startIndex = (total / num) - ((num - 1) / 2);
        for (int i = 0; i < num; i++) {
            indexList.add(startIndex);
            startIndex++;
        }
        return indexList.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
