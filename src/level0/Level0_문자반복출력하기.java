package level0;

public class Level0_문자반복출력하기 {
    public static void main(String[] args) {
        String solution1 = solution("hello", 3);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        int strLength = my_string.length();
        for (int i = 0; i < strLength; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
