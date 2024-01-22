package java.level0;

import java.math.BigInteger;

public class Level0_두수의합 {
    public static void main(String[] args) {
        String solution1 = solution("582", "734");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("18446744073709551615", "287346502836570928366");
        System.out.println("solution2 = " + solution2);

        String solution3 = solution("0", "0");
        System.out.println("solution3 = " + solution3);
    }

    public static String solution(String a, String b) {
        BigInteger first = new BigInteger(a);
        BigInteger second = new BigInteger(b);
        return String.valueOf(first.add(second));
    }
}
