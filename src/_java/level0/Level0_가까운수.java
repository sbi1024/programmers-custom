package _java.level0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Level0_가까운수 {
    public static void main(String[] args) {
        int[] test1 = {3, 10, 28};
        int n1 = 20;
        int solution1 = solution(test1, n1);
        System.out.println("solution1 = " + solution1);


        int[] test2 = {10, 11, 12};
        int n2 = 13;
        int solution2 = solution(test2, n2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] array, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : array) {
            map.put(value, Math.abs(value - n));
        }

        ArrayList<Integer> integers = new ArrayList<>(map.keySet());
        integers.sort((o1, o2) -> {
            int firstValue = map.get(o1.intValue()).intValue();
            int secondValue = map.get(o2.intValue()).intValue();
            if (firstValue > secondValue) {
                return 1;
            } else if (firstValue == secondValue) {
                return 0;
            } else {
                return -1;
            }
        });

        return integers.stream().findFirst().get();
    }
}
