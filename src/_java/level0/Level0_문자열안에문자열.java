package _java.level0;

public class Level0_문자열안에문자열 {
    public static void main(String[] args) {
        String test1 = "ab6CDE443fgh22iJKlmn1o";
        String test2 = "ppprrrogrammers";
        String test3 = "AbcAbcA";

        String test4 = "6CD";
        String test5 = "pppp";
        String test6 = "AAA";

        int solution1 = solution(test1, test4);
        System.out.println("solution1 = " + solution1); // 1

        int solution2 = solution(test2, test5);
        System.out.println("solution2 = " + solution2); // 2

        int solution3 = solution(test3, test6);
        System.out.println("solution3 = " + solution3); // 2
    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) == true ? 1 : 2;
    }
}
