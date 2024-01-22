package _java.level0;

public class Level0_소문자로바꾸기 {
    public static void main(String[] args) {
        String solution1 = solution("aBcDeFg"); // "abcdefg"
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("aaa"); // "aaa"
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }
}
