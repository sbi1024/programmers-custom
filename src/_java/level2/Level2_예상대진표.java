package _java.level2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Level2_예상대진표 {
    public static void main(String[] args) {
        // 8	4	7	3
        int solution1 = solution(8, 4, 7);
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(int n, int a, int b) {
        int answer = 0;

        Map<Integer, Boolean> map = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            if (i == a || i == b) {
                map.put(i, true);
            } else {
                map.put(i, false);
            }
        }
        System.out.println("map = " + map);
        while (true) {
            for (int i = n; i >= 1; i -= 2) {
                Boolean first = map.get(i);
                Boolean second = map.get(i - 1);
                if (first && second) {
                    return answer;
                } else if (first || second) {
                    if (first) {
                        map.remove(i - 1);
                    } else {
                        map.remove(i);
                    }
                } else {
                    map.remove(i);
                }
            }
            answer++;
            n /= 2;

            int index = 1;

            for (Integer key : map.keySet()) {
                map.put(index, map.get(key));
                index++;
            }
        }
    }
}
