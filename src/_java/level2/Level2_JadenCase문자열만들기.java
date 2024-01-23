package _java.level2;

public class Level2_JadenCase문자열만들기 {
    // TODO 아니 이거 다른방식으로 풀면 아예 런타임에러가 뜨는데, 뭔가 이상한데 확인이 필요하다
    public static void main(String[] args) {
        String solution1 = solution("3people unFollowed me");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("for the last week");
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("f");
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int standIndex = -1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == ' ') {
                sb.append(String.valueOf(ch).toLowerCase());
                standIndex = i + 1;
            } else if (i == 0 || i == standIndex) {
                if (checkFirstStrAlphabet(String.valueOf(ch))) {
                    sb.append(String.valueOf(ch).toUpperCase());
                } else {
                    sb.append(String.valueOf(ch).toLowerCase());
                }
            } else {
                sb.append(String.valueOf(ch).toLowerCase());
            }
        }

        return sb.toString();
    }

    public static boolean checkFirstStrAlphabet(String firstStr) {
        int length = firstStr.replaceAll("[A-z]", "").trim().length();
        if (length != 0) {
            return false;
        }
        return true;
    }


}
