package _java.level1;

import java.util.Arrays;

public class Level1_하샤드수 {
    public static void main(String[] args) {
        boolean solution1 = solution(10);
        System.out.println("solution1 = " + solution1);

        boolean solution2 = solution(12);
        System.out.println("solution2 = " + solution2);

        boolean solution3 = solution(11);
        System.out.println("solution3 = " + solution3);

        boolean solution4 = solution(13);
        System.out.println("solution4 = " + solution4);
    }

    public static boolean solution(int x) {
        return x % (Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(Integer::parseInt)
                .sum()) == 0;
    }

}
