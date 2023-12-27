package level0;

public class Level0_문자열정수로변환하기 {
    public static void main(String[] args) {
        int solution1 = solution("10");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("8542");
        System.out.println("solution2 = " + solution2);
    }
    public static int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}
