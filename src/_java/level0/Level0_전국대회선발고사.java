package _java.level0;

import java.util.*;

public class Level0_전국대회선발고사 {
    public static void main(String[] args) {
        int[] test1 = {3, 7, 2, 5, 4, 6, 1};
        boolean[] test2 = {false, true, true, true, true, false, false};
        int solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        int[] test3 = {1, 2, 3};
        boolean[] test4 = {true, true, true};
        int solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);

        int[] test5 = {6, 1, 5, 2, 3, 4};
        boolean[] test6 = {true, false, true, false, false, true};
        int solution3 = solution(test5, test6);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] != false) {
                map.put(rank[i], i);
            }
        }
        List<Integer> mapValueList = new ArrayList<>(map.values());
        List<Integer> mapValueSubList = mapValueList.subList(0, 3);
        return 10000 * mapValueSubList.get(0) + 100 * mapValueSubList.get(1) + mapValueSubList.get(2);
    }

    public static int solution1(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i] != false) {
                map.put(rank[i], i);
            }
        }
        int count = 0;
        Set<Integer> mapKeys = map.keySet();
        for (Integer mapKey : mapKeys) {
            Integer mapValue = map.get(mapKey);
            if (count == 0) {
                answer += 10000 * mapValue;
            } else if (count == 1) {
                answer += 100 * mapValue;
            } else if (count == 2) {
                answer += mapValue;
            }
            count++;
            if (count == 3) {
                break;
            }
        }
        return answer;
    }
}
