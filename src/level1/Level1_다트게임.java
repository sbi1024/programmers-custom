package level1;

import java.util.ArrayList;
import java.util.List;

public class Level1_다트게임 {
    public static void main(String[] args) {
        // 1    1S2D*3T	37	11 * 2 + 22 * 2 + 33
        // 2	1D2S#10S	9	12 + 21 * (-1) + 101
        // 3	1D2S0T	3	12 + 21 + 03
        // 4	1S*2T*3S	23	11 * 2 * 2 + 23 * 2 + 31
        // 5	1D#2S*3S	5	12 * (-1) * 2 + 21 * 2 + 31
        // 6	1T2D3D#	-4	13 + 22 + 32 * (-1)
        // 7	1D2S3T*	59
        int solution1 = solution("1S2D*3T");
        // System.out.println("solution1 = " + solution1);

        int solution2 = solution("1D2S#10S");
//        System.out.println("solution2 = " + solution2);

        int solution3 = solution("1D2S0T");
//        System.out.println("solution3 = " + solution3);

        int solution4 = solution("1S*2T*3S");
//        System.out.println("solution4 = " + solution4);

        int solution5 = solution("1D#2S*3S");
//        System.out.println("solution5 = " + solution5);

        int solution6 = solution("1T2D3D#");
//        System.out.println("solution6 = " + solution6);

        int solution7 = solution("1D2S3T*");
//        System.out.println("solution7 = " + solution7);
    }

    public static int solution(String dartResult) {
        int answer = 0;

        // "점수|보너스|[옵션]"으로 이루어진 문자열 3세트.
        // 점수 : 0 ~ 10 정수
        // 보너스 : S(1제곱) D(2제곱) T(3제곱)
        // 옵션1 : * (스타상) : 해당 점수와 전의 점수를 2배 / 첫번째에 스타상이 나온경우, 첫번재 점수만 2배
        // 옵션2 : # (아차상) : 해당 점수의 마이너스

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

        for (int i = 0; i < list.size(); i++) {
            String listGetStr = list.get(i);
            int listGetLength = list.get(i).length();
            // 옵션값인 경우
            if (listGetLength == 1) {
                System.out.println("listGetStr = " + listGetStr);
            } else {
                // 아닌 경우
                String number = listGetStr.replaceAll("[A-Z]", "");
                String powNumber = listGetStr.replaceAll("[0-9]", "");
                if (powNumber.equals("S")) {
                    powNumber = "1";
                } else if (powNumber.equals("D")) {
                    powNumber = "2";
                } else {
                    powNumber = "3";
                }
                int result = (int) Math.pow(Integer.parseInt(number), Integer.parseInt(powNumber));
                System.out.println("result = " + result);
            }
        }

        return answer;
    }
}
