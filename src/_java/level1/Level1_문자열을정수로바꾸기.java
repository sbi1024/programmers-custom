package _java.level1;

public class Level1_문자열을정수로바꾸기 {
    public static void main(String[] args) {
        int solution1 = solution("1234");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("-1234");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String s) {
        return Integer.parseInt(s);
    }
}
