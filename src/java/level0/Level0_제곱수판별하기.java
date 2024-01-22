package java.level0;

public class Level0_제곱수판별하기 {
    public static void main(String[] args) {
        int solution1 = solution(144);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(976);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        double sqrt = Math.sqrt(n);
        double decimalValue = sqrt - (int) sqrt;

        return decimalValue == 0.0 ? 1 : 2;
    }
}
