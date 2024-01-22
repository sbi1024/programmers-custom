package _java.level0;

import java.util.Map;
import java.util.TreeMap;

public class Level0_개미군단 {
    public static void main(String[] args) {
        int solution1 = solution(23);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(24);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(999);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int hp) {
        int answer = 0;

        while (true) {
            if (hp == 0) {
                break;
            }
            // 정렬이 가능한 TreeMap 변수 선언
            Map<Integer, Integer> map = new TreeMap<>();

            int mod1 = hp / 5;
            int remain1 = hp % 5;

            int mod2 = hp / 3;
            int remain2 = hp % 3;

            int mod3 = hp / 1;
            int remain3 = hp % 1;

            // map 에 데이터 할당
            if (mod1 > 0) {
                map.put(mod1, remain1);
            }
            if (mod2 > 0) {
                map.put(mod2, remain2);
            }
            if (mod3 > 0) {
                map.put(mod3, remain3);
            }

            Integer findFirstMod = map.keySet().stream().findFirst().get();
            Integer findFirstRemain = map.get(findFirstMod);

            answer += findFirstMod;
            hp = findFirstRemain;
        }

        return answer;
    }
}
