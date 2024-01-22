package _java.level0;

import java.util.Arrays;

public class Level0_배열원소의길이 {
    public static void main(String[] args) {
        String[] test1 = {"We", "are", "the", "world!"};
        String[] test2 = {"I", "Love", "Programmers."};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(value -> value.length()).toArray();
    }
}
