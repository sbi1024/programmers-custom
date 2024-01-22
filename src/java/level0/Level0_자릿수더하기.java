package java.level0;

import java.util.Arrays;

public class Level0_자릿수더하기 {
    public static void main(String[] args) {
        int solution1 = solution(1234);
        System.out.println("solution1 = " + solution1); // 10

        int solution2 = solution(930211);
        System.out.println("solution2 = " + solution2); // 16
    }

    public static int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
    }

}
