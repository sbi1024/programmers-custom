package java.level1;

import java.util.*;

public class Level1_모의고사 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 3, 2, 4, 2};
        int[] test3 = {1, 3, 2, 4, 2, 1, 3, 2, 4, 2, 1, 3, 2, 4, 2, 1, 3, 2, 4, 2, 1, 3, 2, 4};

        int[] solution1 = solution(test1); // [1]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2); // [1,2,3]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] answers) {
        // 1. List Map 변수에 각 번호에 맞는 패턴값을 할당
        List<Map<String, Object>> listMap = new ArrayList<>();

        int[] onePatten = {1, 2, 3, 4, 5};
        int[] twoPatten = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] threePatten = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<String, Object> map1 = new HashMap<>();
        map1.put("number", 1);
        map1.put("pattern", onePatten);
        listMap.add(map1);

        Map<String, Object> map2 = new HashMap<>();
        map2.put("number", 2);
        map2.put("pattern", twoPatten);
        listMap.add(map2);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("number", 3);
        map3.put("pattern", threePatten);
        listMap.add(map3);

        // 2. 파라미터의 answers 변수에 맞게 패턴값의 길이 일치 작업 진행
        int answersLength = answers.length;
        for (int i = 0; i < listMap.size(); i++) {
            Map<String, Object> map = listMap.get(i);
            int[] pattern = (int[]) map.get("pattern");
            int patternLength = pattern.length;
            List<Integer> list = new ArrayList<>();
            int count = 0;
            while (count != answersLength) {
                list.add(pattern[count % patternLength]);
                count++;
            }
            map.put("pattern", list);
            map.put("matchCount", 0);
        }

        // 3. 정답과 일치하는 경우 matchCount 값을 증가
        for (Map<String, Object> map : listMap) {
            List<Integer> pattern = (List<Integer>) map.get("pattern");
            int matchCount = (int) map.get("matchCount");
            for (int i = 0; i < pattern.size(); i++) {
                if (pattern.get(i) == answers[i]) {
                    matchCount++;
                }
            }
            map.put("matchCount", matchCount);
            map.remove("pattern");
        }

        // 4. matchCount 값 기준으로 정렬 진행
        Collections.sort(listMap, (o1, o2) -> {
            int matchCount1 = (int) o1.get("matchCount");
            int matchCount2 = (int) o2.get("matchCount");
            if (matchCount1 < matchCount2) {
                return 1;
            } else if (matchCount1 == matchCount2) {
                Integer number1 = (Integer) o1.get("number");
                Integer number2 = (Integer) o2.get("number");
                return number1.compareTo(number2);
            } else {
                return -1;
            }
        });


        // 5. listMap 의 가장 첫번째 인원은 가장 높은 점수를 받은 인원이다.
        List<Integer> returnList = new ArrayList<>();
        Map<String, Object> getFirstListMap = listMap.get(0);
        returnList.add((int) getFirstListMap.get("number"));
        int maxMatchCount = (int) getFirstListMap.get("matchCount");
        for (int i = 1; i < listMap.size(); i++) {
            Map<String, Object> anotherGetListMap = listMap.get(i);
            int anotherMatchCount = (int) anotherGetListMap.get("matchCount");
            if (maxMatchCount == anotherMatchCount) {
                returnList.add((Integer) anotherGetListMap.get("number"));
            }
        }

        return returnList.stream().mapToInt(Integer::intValue).toArray();
    }
}
