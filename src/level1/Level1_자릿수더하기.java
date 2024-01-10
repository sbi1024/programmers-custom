package level1;

import java.util.Arrays;

public class Level1_자릿수더하기 {
    public static void main(String[] args) {
        int solution1 = solution(123);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(987);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }
}
