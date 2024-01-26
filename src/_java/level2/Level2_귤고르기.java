package _java.level2;

import java.util.*;

public class Level2_귤고르기 {
    // TODO 간만에 내 아이디어로 푼 문제네 ..
    // TODO 근데 몇개가 필요한지 count 를 세는 부분에 대한 보완이 있으면 좋을거 같다.
    public static void main(String[] args) {
        int[] test1 = {1, 3, 2, 5, 4, 5, 2, 3};
        int solution1 = solution(6, test1);
        System.out.println("solution1 = " + solution1); // 3

        int[] test2 = {1, 3, 2, 5, 4, 5, 2, 3};
        int solution2 = solution(4, test2);
        System.out.println("solution2 = " + solution2); // 2

        int[] test3 = {1, 1, 1, 1, 2, 2, 2, 3};
        int solution3 = solution(2, test3);
        System.out.println("solution3 = " + solution3); // 1
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int value : tangerine) map.put(value, map.getOrDefault(value, 0) + 1);

        ArrayList<Integer> keyList = new ArrayList<>(map.keySet());
        keyList.sort((o1, o2) -> {
            Integer first = map.get(o1);
            Integer second = map.get(o2);
            if (first < second) {
                return 1;
            } else if (first == second) {
                return 0;
            } else {
                return -1;
            }
        });

        Set<Integer> set = new HashSet<>();
        for (Integer key : keyList) {
            set.add(key);
            answer += map.get(key);
            if (answer >= k) {
                break;
            }
        }

        return set.size();
    }
}
