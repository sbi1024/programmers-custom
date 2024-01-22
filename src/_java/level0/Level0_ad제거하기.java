package _java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_ad제거하기 {
    public static void main(String[] args) {
        String[] test1 = {"and", "notad", "abcd"};
        String[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // ["and","abcd"]

        String[] test2 = {"there", "are", "no", "a", "ds"};
        String[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // ["there","are","no","a","ds"]
    }

    public static String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                list.add(str);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}
