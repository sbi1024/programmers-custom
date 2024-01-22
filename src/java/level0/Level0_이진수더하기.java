package java.level0;

public class Level0_이진수더하기 {
    public static void main(String[] args) {
        String solution1 = solution("10", "11");
        System.out.println("solution1 = " + solution1);

        String solution2 = solution("1001", "1111");
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
