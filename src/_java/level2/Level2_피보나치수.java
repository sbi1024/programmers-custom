package _java.level2;

import java.util.HashMap;
import java.util.Map;

public class Level2_피보나치수 {
    // TODO 아니 점점 수학문제가 나와버리는데 돌아버리겠네
    public static void main(String[] args) {
        int solution1 = solution(3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(5);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(100000);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int n) {
        int stand = 1234567;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);

        for (int i = 2; i <= n; i++) {
            Integer value1 = map.get(i - 1);
            Integer value2 = map.get(i - 2);
            map.put(i, (value1 + value2) % stand);
        }

        return map.get(n);
    }


    public static int solution1(int n) {
        int stand = 1234567;

        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 0L);
        map.put(1, 1L);

        for (int i = 2; i <= n; i++) {
            long remain1 = map.get(i - 1);
            long remain2 = map.get(i - 2);
            map.put(i, (remain1 + remain2) % stand);
        }

        return map.get(n).intValue();
    }

//    public static int solution(int n) {
//        return recursion(n) % 1234567;
//    }
//
//    public static int recursion(int n) {
//        if (n <= 1) {
//            return n;
//        }
//        return recursion(n - 1) + recursion(n - 2);
//    }
}
