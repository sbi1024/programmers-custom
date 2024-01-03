package level0;

public class Level0_문자리스트를문자열로변환하기 {
    public static void main(String[] args) {
        String[] test1 = {"a","b","c"};
        String solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String a : arr) {
            sb.append(a);
        }
        return sb.toString();
    }
}
