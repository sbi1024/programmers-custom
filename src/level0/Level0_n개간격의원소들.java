package level0;

import java.util.ArrayList;
import java.util.List;

public class Level0_n개간격의원소들 {
    public static void main(String[] args) {
        int[] test1 = {4, 2, 6, 1, 7, 6};
        int[] solution1 = solution(test1, 2);
        System.out.println("solution1 = " + solution1); // [4, 6, 7]

        int[] test2 = {4, 2, 6, 1, 7, 6};
        int[] solution2 = solution(test2, 4);
        System.out.println("solution2 = " + solution2); // [4, 7]
    }

    public static int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        int numListLength = num_list.length;
        int mod = numListLength / n;
        int remain = numListLength % n;
        for (int i = 0; i < mod; i++) {
            list.add(num_list[i * n]);
        }
        if (remain != 0) {
            list.add(num_list[mod * n]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
