package level0;

public class Level0_문자열곱하기 {
    public static void main(String[] args) {
        String solution1 = solution("string", 3);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("love", 10);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String my_string, int k) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}
