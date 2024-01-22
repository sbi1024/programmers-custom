package _java.level0;

import java.math.BigInteger;

public class Level0_구슬을나누는경우의수 {
    public static void main(String[] args) {
        int solution1 = solution(3, 2);
        System.out.println("solution1 = " + solution1); // 3

        int solution2 = solution(5, 3);
        System.out.println("solution2 = " + solution2); // 10

        int solution3 = solution(30, 29);
        System.out.println("solution3 = " + solution3);

        int solution4 = solution(30, 30);
        System.out.println("solution4 = " + solution4);
    }

    public static int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }
        BigInteger nFactorial = factorial(new BigInteger(String.valueOf(balls)));
        BigInteger nMinusMFactorial = factorial(new BigInteger(String.valueOf(balls - share)));
        BigInteger mFactorial = factorial(new BigInteger(String.valueOf(share)));
        return nFactorial.divide(nMinusMFactorial.multiply(mFactorial)).intValue();
    }

    public static BigInteger factorial(BigInteger b) {
        if (b.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            return b.multiply(factorial(b.subtract(BigInteger.ONE)));
        }
    }
}
