package level0;

public class Level0_두수의곱 {
    public static void main(String[] args) {
        int solution1 = solution(3, 4);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(27, 19);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int num1, int num2) {
        return num1 * num2;
    }
}
