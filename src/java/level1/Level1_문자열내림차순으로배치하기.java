package java.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Level1_문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        String solution1 = solution("Zbcdefg");
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String s) {
        String[] split = s.split("");
        Arrays.sort(split, Collections.reverseOrder());
        return Arrays.stream(split).map(String::new).collect(Collectors.joining());
    }
}
