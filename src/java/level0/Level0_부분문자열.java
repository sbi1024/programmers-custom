package java.level0;

public class Level0_부분문자열 {
    public static void main(String[] args) {
        int solution1 = solution("abc", "aabcc");
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("tbt", "tbbttb");
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String str1, String str2) {
        if (str2.contains(str1)) {
            return 1;
        } else {
            return 0;
        }
    }
}
