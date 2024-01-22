package java.level0;

public class Level0_특정한문자를대문자로바꾸기 {
    public static void main(String[] args) {
        String solution1 = solution("programmers", "p");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("lowercase", "x");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
