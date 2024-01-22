package java.level0;

import java.util.Arrays;

public class Level0_분수의덧셈 {
    public static void main(String[] args) {
        int[] solution1 = solution(1, 2, 3, 4);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(9, 2, 1, 3);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int multipleNumer = (numer1 * denom2) + (numer2 * denom1);
        int multipleDenom = denom1 * denom2;
        int gdcNumber = greatestCommonDivisor(multipleNumer, multipleDenom);
        answer[0] = multipleNumer / gdcNumber;
        answer[1] = multipleDenom / gdcNumber;

        return answer;
    }

    public static int greatestCommonDivisor(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return greatestCommonDivisor(num2, num1 % num2);
    }
}
