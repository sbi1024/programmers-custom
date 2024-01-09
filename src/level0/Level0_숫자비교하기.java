package level0;

public class Level0_숫자비교하기 {
    public static void main(String[] args) {
        int solution1 = solution(2, 3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(11, 11);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(7, 99);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }
}
