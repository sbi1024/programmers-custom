package _java.level1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Level1_성격유형검사하기 {
    // TODO 한번에 정답맞췄으나, 왜이렇게 속도가 생각보다 안나오는지 알아봐야할듯 (엄청 빠를줄 앎)
    public static void main(String[] args) {
        String[] test1 = {"AN", "CF", "MJ", "RT", "NA"};
        int[] test2 = {5, 3, 2, 7, 5};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1); // "TCMA"

        String[] test3 = {"TR", "RT", "TR"};
        int[] test4 = {7, 1, 3};
        String solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2); // "RCJA"
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();

        String[] indicators = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String indicator : indicators) map.put(indicator, 0);

        for (int i = 0; i < survey.length; i++) {
            String[] splitSur = survey[i].split("");
            int choice = choices[i];
            if (choice < 4) {
                String leftSur = splitSur[0];
                map.put(leftSur, map.get(leftSur) + choiceCheck(choice));
            } else if (choice > 4) {
                String rightSur = splitSur[1];
                map.put(rightSur, map.get(rightSur) + choiceCheck(choice));
            }
        }

        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        for (int i = 0; i < keyList.size(); i += 2) {
            String firstKey = keyList.get(i);
            String secondKey = keyList.get(i + 1);
            Integer firstValue = map.get(firstKey);
            Integer secondValue = map.get(secondKey);
            if (firstValue > secondValue) {
                sb.append(firstKey);
            } else if (firstValue.equals(secondValue)) {
                int compareTo = firstKey.compareTo(secondKey);
                if (compareTo < 0) {
                    sb.append(firstKey);
                } else if (compareTo > 0) {
                    sb.append(secondKey);
                }
            } else {
                sb.append(secondKey);
            }
        }
        return sb.toString();
    }

    public static int choiceCheck(int choice) {
        int answer = 0;
        switch (choice) {
            case 1:
            case 7:
                answer = 3;
                break;
            case 2:
            case 6:
                answer = 2;
                break;
            case 3:
            case 5:
                answer = 1;
                break;
        }
        return answer;
    }
}
