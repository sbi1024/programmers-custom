package _java.level1;

public class Level1_문자열다루기기본 {
    public static void main(String[] args) {
        boolean solution1 = solution("a234");
        System.out.println("solution1 = " + solution1);

        boolean solution2 = solution("1234");
        System.out.println("solution2 = " + solution2);
    }

    public static boolean solution(String s) {
        int sLength = s.length();
        if (sLength == 4 || sLength == 6) {
            if (s.replaceAll("[0-9]", "").length() == 0) {
                return true;
            }
        }
        return false;
    }
}
