package _java.level2;

import java.util.HashMap;
import java.util.Map;

public class Level2_할인행사 {
    public static void main(String[] args) {
        String[] test1 = {"banana", "apple", "rice", "pork", "pot"};
        int[] test2 = {3, 2, 2, 2, 1};
        String[] test3 = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int solution1 = solution(test1, test2, test3);
        System.out.println("solution1 = " + solution1); // 3

        String[] test4 = {"apple"};
        int[] test5 = {10};
        String[] test6 = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};
        int solution2 = solution(test4, test5, test6);
        System.out.println("solution2 = " + solution2); // 0
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) wantMap.put(want[i], number[i]);

        Map<Integer, String> discountMap = new HashMap<>();
        for (int i = 0; i < discount.length; i++) discountMap.put(i + 1, discount[i]);

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> targetMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                String discountProduct = discountMap.get(j + 1);
                targetMap.put(discountProduct, targetMap.getOrDefault(discountProduct, 0) + 1);
            }
            boolean targetCheck = true;
            for (Map.Entry<String, Integer> es : targetMap.entrySet()) {
                String key = es.getKey();
                if (!(es.getValue().equals(wantMap.get(key)))) {
                    targetCheck = false;
                    break;
                }
            }
            if (targetCheck) answer++;
        }

        return answer;
    }
}
