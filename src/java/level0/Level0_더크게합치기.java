package java.level0;

public class Level0_더크게합치기 {
    public static void main(String[] args) {
        int solution1 = solution(9, 91);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(89, 8);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int a, int b) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append(a).append(b);

        StringBuffer sb2 = new StringBuffer();
        sb2.append(b).append(a);

        int firstValue = Integer.parseInt(sb1.toString());
        int secondValue = Integer.parseInt(sb2.toString());

        return Math.max(firstValue, secondValue);
    }
}
