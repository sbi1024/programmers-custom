package _java.level0;

public class Level0_문자열로변환 {
    public static void main(String[] args) {
        String solution1 = solution(123);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution(2573);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(int n) {
        return String.valueOf(n);
    }
}
