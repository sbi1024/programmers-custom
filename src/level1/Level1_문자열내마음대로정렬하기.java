package level1;

import java.util.Arrays;

public class Level1_문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        // ["sun", "bed", "car"]	1	["car", "bed", "sun"]
        // ["abce", "abcd", "cdx"]	2	["abcd", "abce", "cdx"]
        String[] test1 = {"sun", "bed", "car"};
        String[] test2 = {"abce", "abcd", "cdx"};

        String[] solution1 = solution(test1, 1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] solution2 = solution(test2, 2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};



        return answer;
    }
}
