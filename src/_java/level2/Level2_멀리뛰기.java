package _java.level2;

import java.util.HashMap;
import java.util.Map;

public class Level2_멀리뛰기 {
    // TODO Level2 문제는 수학문제 + 재귀함수 + 순열 조합에 대한 개념이 존재해야 하는거 같다.
    // TODO 문제풀때마다 해당 개념에 대한 재 정립을 하면서 진행해야 할 것 같다.
    public static void main(String[] args) {
        long solution1 = solution(4);
        System.out.println("solution1 = " + solution1); // 5

        long solution2 = solution(3);
        System.out.println("solution2 = " + solution2); // 3

        long solution3 = solution(2000);
        System.out.println("solution3 = " + solution3); // 694725
    }

    public static long solution(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);

        for (int i = 3; i <= n; i++) {
            Integer first = map.get(i - 1);
            Integer second = map.get(i - 2);
            map.put(i, (first + second) % 1234567);
        }

        return map.get(n);
    }
}
