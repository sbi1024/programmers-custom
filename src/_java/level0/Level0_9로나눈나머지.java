package _java.level0;


import java.util.Arrays;

public class Level0_9로나눈나머지 {
    public static void main(String[] args) {
        int solution1 = solution("123");
        System.out.println("solution1 = " + solution1); // 6

        int solution2 = solution("78720646226947352489");
        System.out.println("solution2 = " + solution2); // 2
    }

    public static int solution(String number) {
        return Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum() % 9;
    }
}
