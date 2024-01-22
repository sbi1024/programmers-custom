package _java.level1;

import java.util.ArrayList;
import java.util.List;

public class Level1_다트게임 {
    // TODO 문제의 정답은 맞췄는데, STACK 으로 풀었으면 더 좋았을 것 같음
    // 인덱스를 조작해서 문제를 푸려고 하니까, 디버깅도 어렵고 다시 이 코드 봐도 기억이 안날거 같다...
    public static void main(String[] args) {
        int solution1 = solution("1S2D*3T");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("1D2S#10S");
        System.out.println("solution2 = " + solution2);

        int solution3 = solution("1D2S0T");
        System.out.println("solution3 = " + solution3);

        int solution4 = solution("1S*2T*3S");
        System.out.println("solution4 = " + solution4);

        int solution5 = solution("1D#2S*3S");
        System.out.println("solution5 = " + solution5);

        int solution6 = solution("1T2D3D#");
        System.out.println("solution6 = " + solution6);

        int solution7 = solution("1D2S3T*");
        System.out.println("solution7 = " + solution7);
    }

    public static int solution(String dartResult) {
        int answer = 0;

        List<String> list = new ArrayList<>();
        int startIndex = 0;
        char[] chars = dartResult.toCharArray();
        int charLength = chars.length;
        for (int i = 0; i < charLength; i++) {
            char aChar = chars[i];
            if (Character.isUpperCase(aChar)) {
                list.add(dartResult.substring(startIndex, i + 1));
                startIndex = i + 1;
                if (i != charLength - 1) {
                    char plusAChar = chars[i + 1];
                    if (plusAChar == '*' || plusAChar == '#') {
                        list.add(String.valueOf(plusAChar));
                        startIndex++;
                    }
                }
            }
        }

        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String listGetStr = list.get(i);
            int listGetLength = listGetStr.length();
            if (listGetLength == 1) {
                int resultListSize = resultList.size();
                if (listGetStr.equals("*")) {
                    resultList.set(resultListSize - 1, resultList.get(resultListSize - 1) * 2);
                    if (resultListSize >= 2) {
                        resultList.set(resultListSize - 2, resultList.get(resultListSize - 2) * 2);
                    }
                } else {
                    resultList.set(resultListSize - 1, resultList.get(resultListSize - 1) * -1);
                }
            } else {
                String number = listGetStr.replaceAll("[A-Z]", "");
                String powNumber = listGetStr.replaceAll("[0-9]", "");
                if (powNumber.equals("S")) {
                    powNumber = "1";
                } else if (powNumber.equals("D")) {
                    powNumber = "2";
                } else {
                    powNumber = "3";
                }
                resultList.add((int) Math.pow(Integer.parseInt(number), Integer.parseInt(powNumber)));
            }
        }

        for (Integer result : resultList) {
            answer += result;
        }

        return answer;
    }
}
