package _java.level2;

import java.util.Arrays;

public class Level2_최댓값과최솟값 {
    public static void main(String[] args) {
        String solution1 = solution("1 2 3 4");
        System.out.println("solution1 = " + solution1); // "1 4"

        String solution2 = solution("-1 -2 -3 -4");
        System.out.println("solution2 = " + solution2); // "-4 -1"

        String solution3 = solution("-1 -1");
        System.out.println("solution3 = " + solution3); // "-1 -1"
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitS = s.split(" ");
        int min = Arrays.stream(splitS).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Arrays.stream(splitS).mapToInt(Integer::parseInt).max().getAsInt();

        sb.append(min).append(" ").append(max);
        return sb.toString();
    }
}
