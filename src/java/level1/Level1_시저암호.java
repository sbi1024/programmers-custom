package java.level1;

public class Level1_시저암호 {
    public static void main(String[] args) {
        // TODO 다시풀어보기 (풀이과정을 봐도 모르겠음)
        String solution1 = solution("AB", 1); // "BC"
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("z", 1); // "a"
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("a B z", 4); // "e F d"
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
