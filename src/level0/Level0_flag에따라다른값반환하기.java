package level0;

public class Level0_flag에따라다른값반환하기 {
    public static void main(String[] args) {
        int solution1 = solution(-4, 7, true);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(-4, 7, false);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int a, int b, boolean flag) {
        if (flag) {
            return a + b;
        } else {
            return a - b;
        }
    }
}
