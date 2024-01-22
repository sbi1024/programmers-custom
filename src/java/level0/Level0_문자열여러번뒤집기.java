package java.level0;

public class Level0_문자열여러번뒤집기 {
    public static void main(String[] args) {
        String test1 = "rermgorpsam";
        int[][] test2 = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1); // programmers

        String test3 = "abab";
        int[][] test4 = {{2, 3}};
        String solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2); // abba
    }

    public static String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();

        for (int[] query : queries) {
            String subMyString = my_string.substring(query[0], query[1] + 1);
            sb.append(subMyString);
            sb.reverse();
            String firstStr = my_string.substring(0, query[0]);
            String secondStr = my_string.substring(query[1] + 1);
            my_string = firstStr + sb + secondStr;
            sb.delete(0, sb.toString().length());
        }

        return my_string;
    }
}
