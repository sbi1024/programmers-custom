package java.level0;

import java.util.Arrays;

public class Level0_공백으로구분하기1 {
    public static void main(String[] args) {
        String[] solution1 = solution("i love you");// ["i", "love", "you"]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] solution2 = solution("programmers");// ["programmers"]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String my_string) {
        return my_string.split(" ");
    }
}
