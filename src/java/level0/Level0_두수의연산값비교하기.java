package java.level0;

public class Level0_두수의연산값비교하기 {
    public static void main(String[] args) {
        int solution1 = solution(2, 91);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(91, 2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int a, int b) {
        StringBuffer sb = new StringBuffer();
        sb.append(a).append(b);
        int inSb = Integer.parseInt(sb.toString());
        return Math.max(inSb, 2 * a * b);
    }
}
