package _java.level0;

public class Level0_n의배수 {
    public static void main(String[] args) {
        int solution1 = solution(98, 2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(34, 3);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int num, int n) {
        if (num % n == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
