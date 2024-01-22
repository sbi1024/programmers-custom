package java.level0;

public class Level0_부분문자열이어붙여문자열만들기 {
    public static void main(String[] args) {
        String[] test1 = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] test2 = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            String subMyString = my_strings[i].substring(parts[i][0], parts[i][1] + 1);
            sb.append(subMyString);
        }
        return sb.toString();
    }
}
