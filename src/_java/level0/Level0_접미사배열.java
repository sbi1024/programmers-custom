package _java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level0_접미사배열 {
    public static void main(String[] args) {
        String[] solution1 = solution("banana");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] solution2 = solution("programmers");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            list.add(my_string.substring(i));
        }
        Collections.sort(list);
        return list.stream().toArray(String[]::new);
    }
}
