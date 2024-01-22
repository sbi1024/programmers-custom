package _java.level0;

public class Level0_코드처리하기 {
    public static void main(String[] args) {
        String solution1 = solution("abc1abc1abc");
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String code) {
        StringBuffer sb = new StringBuffer();
        int mod = 0;
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (mod == 0) {
                if (ch == '1') {
                    mod = 1;
                } else {
                    if (i % 2 == 0) {
                        sb.append(ch);
                    }
                }
            } else {
                if (ch == '1') {
                    mod = 0;
                } else {
                    if (i % 2 != 0) {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString().length() == 0 ? "EMPTY" : sb.toString();
    }
}
