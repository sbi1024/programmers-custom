package java.level0;

import java.util.Arrays;

public class Level0_x사이의개수 {
    public static void main(String[] args) {
        int[] solution1 = solution("oxooxoxxox");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution("xabcxdefxghi");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(String myString) {
        return Arrays.stream(myString.split("x",-1))
                .mapToInt(String::length)
                .toArray();
    }
}
