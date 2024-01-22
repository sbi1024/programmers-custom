package java.level0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Level0_주사위게임3 {
    public static void main(String[] args) {
        int solution1 = solution(2, 2, 2, 2);
        System.out.println("solution1 = " + solution1); // 2222

        int solution2 = solution(4, 1, 4, 4);
        System.out.println("solution2 = " + solution2); // 1681

        int solution3 = solution(6, 3, 3, 6);
        System.out.println("solution3 = " + solution3); // 27

        int solution4 = solution(2, 5, 2, 6);
        System.out.println("solution4 = " + solution4); // 30

        int solution5 = solution(6, 4, 2, 5);
        System.out.println("solution5 = " + solution5); // 2
    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(a, 0);
        map.put(b, 0);
        map.put(c, 0);
        map.put(d, 0);

        for (int i = 0; i < list.size(); i++)
            map.put(list.get(i), map.get(list.get(i)) + 1);

        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        int maxValue = map.values().stream().mapToInt(Integer::intValue).max().getAsInt();

        switch (maxValue) {
            case 4:
                int p4 = keyList.stream().findFirst().get();
                answer = 1111 * p4;
                break;
            case 3:
                int p3 = keyList.stream().filter(value -> map.get(value) > 1).findFirst().get();
                int q3 = keyList.stream().filter(value -> map.get(value) == 1).findFirst().get();
                answer = (int) Math.pow((10 * p3) + q3, 2);
                break;
            case 2:
                if (keyList.size() == 2) {
                    int p2 = keyList.get(0);
                    int q2 = keyList.get(1);
                    answer = (p2 + q2) * Math.abs(p2 - q2);
                } else {
                    List<Integer> maxNotKeyValue = keyList.stream().filter(value -> map.get(value) != 2).collect(Collectors.toList());
                    int p2 = maxNotKeyValue.get(0);
                    int q2 = maxNotKeyValue.get(1);
                    answer = p2 * q2;
                }
                break;
            case 1:
                answer = keyList.stream().mapToInt(Integer::intValue).min().getAsInt();
                break;
        }
        return answer;
    }
}
