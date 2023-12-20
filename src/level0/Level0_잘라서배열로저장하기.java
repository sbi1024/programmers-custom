package level0;

import java.util.Arrays;

public class Level0_잘라서배열로저장하기 {
    public static void main(String[] args) {
        String[] solution1 = solution("abc1Addfggg4556b", 6);
        System.out.println("solution1 = " + Arrays.toString(solution1));

        String[] solution2 = solution("abcdef123", 3);
        System.out.println("solution2 = " + Arrays.toString(solution2));
    }

    public static String[] solution(String my_str, int n) {
        String[] splitStr = my_str.split("");
        int answerLength;
        int splitStrRemain = splitStr.length % n;
        if (splitStrRemain == 0) {
            answerLength = (splitStr.length / n);
        } else {
            answerLength = (splitStr.length / n) + 1;
        }
        String[] answer = new String[answerLength];

        for (int i = 0; i < answerLength; i++) {
            int startIndex;
            if (i == 0) {
                startIndex = 0;
            } else {
                startIndex = i * n;
            }
            int endIndex = (i + 1) * n;
            if (endIndex >= splitStr.length) {
                endIndex = splitStr.length;
            }

            if (startIndex == endIndex) {
                return answer;
            }

            answer[i] = my_str.substring(startIndex, endIndex);
        }
        return answer;
    }
}
