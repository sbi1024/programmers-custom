package level0;

import java.util.Arrays;

public class Level0_숨어있는숫자의덧셈1 {
    public static void main(String[] args) {
        int solution1 = solution("aAb1Bw2cC34oOp");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("1a2b3c4d123");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String my_string) {
        return Arrays.stream(my_string.replaceAll("[^0-9]", "").split("")).mapToInt(Integer::parseInt).sum();
    }
}
