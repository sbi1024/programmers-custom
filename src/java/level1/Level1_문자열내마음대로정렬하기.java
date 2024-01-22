package java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level1_문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        // TODO 제대로 이해못했음, 다시 풀어봐야함 (알고리즘의 이해가 부족한게 아닌, 문제를 이해못하겠음)
        String[] test1 = {"sun", "bed", "car"};
        String[] test2 = {"abce", "abcd", "cdx"};

        String[] solution1 = solution(test1, 1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] solution2 = solution(test2, 2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        List<String> list = new ArrayList<>();
        for (String string : strings) {
            char ch = string.charAt(n);
            list.add(ch + string);
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
