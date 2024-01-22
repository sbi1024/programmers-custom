package _java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level0_특이한정렬 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6};
        int[] test2 = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int test3 = 4;
        int test4 = 30;

        int[] solution1 = solution(test1, test3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] numlist, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numlist) {
            map.put(num, Math.abs(n - num));
        }
        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> {
            if (map.get(o1).intValue() > map.get(o2).intValue()) {
                return 1;
            } else if (map.get(o1).intValue() == map.get(o2).intValue()) {
                if (o1.intValue() > o2.intValue()) {
                    return -1;
                } else if (o1.intValue() == o2.intValue()) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        });
        return keyList.stream().mapToInt(Integer::intValue).toArray();
    }
}
