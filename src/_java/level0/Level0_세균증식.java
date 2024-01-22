package _java.level0;

public class Level0_세균증식 {
    public static void main(String[] args) {
        int solution1 = solution(2, 10);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(7, 15);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n, int t) {
        for (int i = 1; i <= t; i++) {
            n = n * 2;
        }
        return n;
    }
}
