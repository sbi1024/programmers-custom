package level0;

import java.util.Arrays;

public class Level0_배열에서문자열대소문자변환하기 {
    public static void main(String[] args) {
        String[] test1 = {"AAA", "BBB", "CCC", "DDD"};
        String[] solution1 = solution(test1); // ["aaa","BBB","ccc","DDD"]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] test2 = {"aBc", "AbC"};
        String[] solution2 = solution(test2); // ["abc","ABC"]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 != 0) {
                answer[i] = strArr[i].toUpperCase();
            } else {
                answer[i] = strArr[i].toLowerCase();
            }
        }
        return answer;
    }
}
