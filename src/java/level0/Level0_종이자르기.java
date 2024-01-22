package java.level0;

public class Level0_종이자르기 {
    public static void main(String[] args) {
        int solution1 = solution(2, 2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(2, 5);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(1, 1);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int M, int N) {
        return M * N - 1;
    }
}
