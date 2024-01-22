package java.level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Level1_가장많이받은선물 {
    // TODO 문제 지문이 이해가 안가서 3시간정도 푼거같다;;, 풀이 예시를 보고 조건을 역으로 세워서 풀이했음

    public static void main(String[] args) {
        String[] test1 = {"muzi", "ryan", "frodo", "neo"};
        String[] test2 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}; // 2
        int solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        String[] test3 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] test4 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}; // 4
        int solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);

        String[] test5 = {"a", "b", "c"};
        String[] test6 = {"a b", "b a", "c a", "a c", "a c", "c a"}; // 0
        int solution3 = solution(test5, test6);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(String[] friends, String[] gifts) {
        Map<String, Integer> resultMap = new HashMap<>();
        Map<String, List<String>> giveHistoryMap = new HashMap<>();
        Map<String, List<String>> receiveHistoryMap = new HashMap<>();

        for (String friend : friends) {
            resultMap.put(friend, 0);
            giveHistoryMap.put(friend, new ArrayList<>());
            receiveHistoryMap.put(friend, new ArrayList<>());
        }

        for (String gift : gifts) {
            String[] giftSplit = gift.split(" ");
            String key = giftSplit[0];
            String value = giftSplit[1];

            List<String> giveList = giveHistoryMap.get(key);
            giveList.add(value);
            giveHistoryMap.put(key, giveList);

            List<String> receiveList = receiveHistoryMap.get(value);
            receiveList.add(key);
            receiveHistoryMap.put(value, receiveList);
        }

        for (int i = 0; i < friends.length - 1; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String key1 = friends[i];
                String key2 = friends[j];
                int keyCount1 = 0;
                int keyCount2 = 0;

                List<String> list1 = giveHistoryMap.get(key1);
                List<String> list2 = giveHistoryMap.get(key2);
                for (String list : list1) if (list.equals(key2)) keyCount1++;
                for (String list : list2) if (list.equals(key1)) keyCount2++;

                int exponent1 = giveHistoryMap.get(key1).size() - receiveHistoryMap.get(key1).size();
                int exponent2 = giveHistoryMap.get(key2).size() - receiveHistoryMap.get(key2).size();

                if (keyCount1 == keyCount2) {
                    if (exponent1 > exponent2) {
                        resultMap.put(key1, resultMap.get(key1) + 1);
                    } else if (exponent1 == exponent2) {
                        continue;
                    } else {
                        resultMap.put(key2, resultMap.get(key2) + 1);
                    }
                } else if (keyCount1 > 0 || keyCount2 > 0) {
                    if (keyCount1 > keyCount2) {
                        resultMap.put(key1, resultMap.get(key1) + 1);
                    } else {
                        resultMap.put(key2, resultMap.get(key2) + 1);
                    }
                }
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> es : resultMap.entrySet()) {
            int value = es.getValue();
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

