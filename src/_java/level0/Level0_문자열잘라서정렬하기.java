package _java.level0;

import java.util.Arrays;

public class Level0_문자열잘라서정렬하기 {
    public static void main(String[] args) {
        String[] solution1 = solution("axbxcxdx");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] solution2 = solution("dxccxbbbxaaaa");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        String[] solution3 = solution("zxcxbxaxxxxxxx");
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        String[] solution4 = solution("dxccxbbbxxaaaa");
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));
    }

    public static String[] solution(String myString) {
        return Arrays.stream(myString.split("x"))
                .filter(value -> !value.isEmpty())
                .sorted()
                .toArray(String[]::new);
    }
}
