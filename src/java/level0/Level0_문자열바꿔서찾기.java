package java.level0;

public class Level0_문자열바꿔서찾기 {
    public static void main(String[] args) {
        int solution1 = solution("ABBAA", "AABB"); // 1
        System.out.println("solution1 = " + solution1);

        int solution2 = solution("ABAB", "ABAB"); // 0
        System.out.println("solution2 = " + solution2);

    }

    public static int solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer();
        String[] split = myString.split("");
        for (String spl : split) {
            if (spl.equals("A")) {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}
