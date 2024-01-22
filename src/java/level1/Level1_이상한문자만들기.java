package java.level1;

public class Level1_이상한문자만들기 {
    public static void main(String[] args) {
        String solution1 = solution("try hello world");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("aaa  a"); // "AaA A"
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("aaa  ab c "); // "AaA Ab C "
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String s) {
        StringBuffer sb = new StringBuffer();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                count = 0;
                sb.append(ch);
            } else if (count % 2 == 0) {
                sb.append(String.valueOf(ch).toUpperCase());
                count++;
            } else {
                sb.append(String.valueOf(ch).toLowerCase());
                count++;
            }
        }

        return sb.toString();
    }
}
