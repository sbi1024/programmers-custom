package java.level0;

public class Level0_문자열섞기 {
    public static void main(String[] args) {
        String solution1 = solution("aaaaa", "bbbbb");
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return sb.toString();
    }

}
