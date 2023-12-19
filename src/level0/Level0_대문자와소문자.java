package level0;

public class Level0_대문자와소문자 {
    public static void main(String[] args) {
        String solution1 = solution("cccCCC");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("abCdEfghIJ");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for (char ch : charArray) {
            if (Character.isUpperCase(ch)) {
                answer += String.valueOf(ch).toLowerCase();
            } else {
                answer += String.valueOf(ch).toUpperCase();
            }
        }
        return answer;
    }
}
