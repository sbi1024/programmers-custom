package java.level0;

import java.util.Arrays;

public class Level0_문자열정수의합 {
    public static void main(String[] args) {
        int solution1 = solution("123456789");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("1000000");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String num_str) {
        return Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
    }
}
