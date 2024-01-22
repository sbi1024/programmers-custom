package _java.level0;

public class Level0_다음에올숫자 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4}; // 5
        int[] test2 = {2, 4, 8}; // 16

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] common) {
        boolean arithmeticCheck = arithmeticCheck(common);
        if (arithmeticCheck == true) {
            return common[common.length-1] + (common[1] - common[0]);
        } else {
            return common[common.length-1] * (common[1] / common[0]);
        }
    }

    public static boolean arithmeticCheck(int[] array) {
        if (array[1] - array[0] == array[2] - array[1]) {
            return true;
        }
        return false;
    }
}
