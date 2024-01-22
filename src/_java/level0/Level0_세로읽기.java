package _java.level0;

public class Level0_세로읽기 {
    public static void main(String[] args) {

        String solution1 = solution("ihrhbakrfpndopljhygc", 4, 2);
        System.out.println("solution1 = " + solution1); // happy

        String solution2 = solution("programmers", 1, 1);
        System.out.println("solution2 = " + solution2); // programmers
    }

    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i += m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }
}
