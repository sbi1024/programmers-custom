package java.level0;

public class Level0_두수의차 {
    public static void main(String[] args) {
        int solution1 = solution(2, 3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(100, 2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
