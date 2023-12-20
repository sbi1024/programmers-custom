package level0;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Level0_문자열정렬하기2 {
    public static void main(String[] args) {
        String solution1 = solution("Bcad");
        System.out.println("solution1 = " + solution1); // abcd

        String solution2 = solution("heLLo");
        System.out.println("solution2 = " + solution2); // ehllo

        String solution3 = solution("Python");
        System.out.println("solution3 = " + solution3); // hnopty
    }

    public static String solution(String my_string) {
        return Arrays.stream(my_string.toLowerCase().split("")).sorted().collect(Collectors.joining());
    }
}
