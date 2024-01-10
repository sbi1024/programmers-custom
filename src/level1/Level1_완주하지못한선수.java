package level1;

import java.util.HashMap;
import java.util.Map;

public class Level1_완주하지못한선수 {
    public static void main(String[] args) {
        String[] test1 = {"leo", "kiki", "eden"};
        String[] test2 = {"eden", "kiki"};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        String[] test3 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] test4 = {"josipa", "filipa", "marina", "nikola"};
        String solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);

        String[] test5 = {"mislav", "stanko", "mislav", "ana"};
        String[] test6 = {"stanko", "ana", "mislav"};
        String solution3 = solution(test5, test6);
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> particiMap = new HashMap<>();
        for (String part : participant) {
            Integer particiMapValue = particiMap.get(part);
            if (particiMapValue == null) {
                particiMap.put(part, 1);
            } else {
                particiMap.put(part, particiMapValue + 1);
            }
        }
        for (String comple : completion) {
            Integer particiMapValue = particiMap.get(comple) - 1;
            particiMap.put(comple, particiMapValue);
        }
        for (Map.Entry<String, Integer> es : particiMap.entrySet()) {
            if (es.getValue() == 1) {
                answer = es.getKey();
                break;
            }
        }
        return answer;
    }
}
