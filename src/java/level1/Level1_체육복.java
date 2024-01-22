package java.level1;

import java.util.HashMap;
import java.util.Map;

public class Level1_체육복 {
    public static void main(String[] args) {
        int[] test1 = {2, 4};
        int[] test2 = {1, 3, 5};
        int[] test3 = {2, 4};
        int[] test4 = {3};
        int[] test5 = {3};
        int[] test6 = {1};
        int[] test7 = {1, 2, 3};
        int[] test8 = {1, 2, 3};
        int[] test9 = {1, 3, 5, 7};
        int[] test10 = {1, 3, 5, 7};
        int[] test11 = {4, 5};
        int[] test12 = {3, 4};
        int[] test13 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29};
        int[] test14 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30};

        int solution1 = solution(5, test1, test2);
        System.out.println("solution1 = " + solution1); // 5

        int solution2 = solution(5, test3, test4);
        System.out.println("solution2 = " + solution2); // 4

        int solution3 = solution(3, test5, test6);
        System.out.println("solution3 = " + solution3); // 2

        int solution4 = solution(3, test7, test8);
        System.out.println("solution4 = " + solution4); // 3

        int solution5 = solution(7, test9, test10);
        System.out.println("solution5 = " + solution5); // 7

        int solution6 = solution(5, test11, test12);
        System.out.println("solution6 = " + solution6); // 4

        int solution7 = solution(30, test13, test14);
        System.out.println("solution7 = " + solution7); // 30
    }


    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) map.put(i, 1);
        for (int los : lost) map.put(los, map.get(los) - 1);
        for (int rev : reserve) map.put(rev, map.get(rev) + 1);

        for (int i = 1; i <= n; i++) {
            if (map.get(i) == 0) {
                if (i == 1) {
                    int nextMapValue = map.get(i + 1);
                    if (nextMapValue == 2) {
                        map.put(i + 1, nextMapValue - 1);
                        map.put(i, map.get(i) + 1);
                    }
                } else if (i == n) {
                    int prevMapValue = map.get(i - 1);
                    if (prevMapValue == 2) {
                        map.put(i - 1, prevMapValue - 1);
                        map.put(i, map.get(i) + 1);
                    }
                } else {
                    int prevMapValue = map.get(i - 1);
                    if (prevMapValue == 2) {
                        map.put(i - 1, prevMapValue - 1);
                        map.put(i, map.get(i) + 1);
                    } else {
                        int nextMapValue = map.get(i + 1);
                        if (nextMapValue == 2) {
                            map.put(i + 1, nextMapValue - 1);
                            map.put(i, map.get(i) + 1);
                        }
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (map.get(i) != 0) {
                answer++;
            }
        }
        return answer;
    }
}
