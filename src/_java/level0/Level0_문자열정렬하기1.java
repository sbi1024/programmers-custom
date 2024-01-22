package _java.level0;

import java.util.Arrays;

public class Level0_문자열정렬하기1 {
    public static void main(String[] args) {
        int[] solution1 = solution("hi12392");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution("p2o4i8gj2");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution("abcde0");
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
