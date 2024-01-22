package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_배열만들기2 {
    public static void main(String[] args) {
        int[] solution1 = solution(5, 555);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(10, 20);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            String replaceStr = str.replace("0", "").replace("5", "");
            if (replaceStr.isEmpty()) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        return list.stream().mapToInt(Integer::intValue).sorted().toArray();
    }
}
