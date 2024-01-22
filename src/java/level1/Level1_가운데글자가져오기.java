package java.level1;

public class Level1_가운데글자가져오기 {
    public static void main(String[] args) {
        String solution1 = solution("abcde");
        System.out.println("solution1 = " + solution1); // "c"

        String solution2 = solution("qwer");
        System.out.println("solution2 = " + solution2); // "we"
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int sLengthDivideTwo = s.length() / 2;
        if (s.length() % 2 == 0) {
            return sb.append(s.charAt(sLengthDivideTwo - 1)).append(s.charAt(sLengthDivideTwo)).toString();
        } else {
            return sb.append(s.charAt(sLengthDivideTwo)).toString();
        }
    }
}
