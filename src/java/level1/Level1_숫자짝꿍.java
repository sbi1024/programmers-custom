package java.level1;

import java.util.HashMap;
import java.util.Map;

public class Level1_숫자짝꿍 {
    // TODO 문자열 문제 + 시간 복잡도 문제 = 정답 실패

    public static void main(String[] args) {
        String solution1 = solution("100", "2345");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("100", "203045");
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("100", "123450");
        System.out.println("solution3 = " + solution3);

        String solution4 = solution("12321", "42531");
        System.out.println("solution4 = " + solution4);

        String solution5 = solution("5525", "1255");
        System.out.println("solution5 = " + solution5);

        String solution6 = solution("010", "100");
        System.out.println("solution6 = " + solution6);

        String solution7 = solution("3000000", "0000003");
        System.out.println("solution7 = " + solution7);
    }

    public static String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        String[] splitX = X.split("");
        Map<String, Integer> mapX = new HashMap<>();
        for (String x : splitX) mapX.put(x, mapX.getOrDefault(x, 0) + 1);

        String[] splitY = Y.split("");
        Map<String, Integer> mapY = new HashMap<>();
        for (String y : splitY) mapY.put(y, mapY.getOrDefault(y, 0) + 1);

        for (int i = 9; i >= 0; i--) {
            String key = String.valueOf(i);
            int minValue = Math.min(mapX.getOrDefault(key, 0), mapY.getOrDefault(key, 0));
            for (int j = 0; j < minValue; j++) {
                sb.append(key);
            }
        }

        String result = sb.toString();
        if (result.isEmpty()) {
            return "-1";
        } else if (result.replace("0", "").isEmpty()) {
            return "0";
        } else {
            return result;
        }
    }
}
