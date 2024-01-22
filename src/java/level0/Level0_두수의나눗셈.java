package java.level0;

public class Level0_두수의나눗셈 {
    public static void main(String[] args) {
        int solution1 = solution(3, 2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(7, 3);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(1, 16);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int num1, int num2) {
        double doubleValue = (double) num1 / num2;
        return (int) (doubleValue * 1000);
    }

}
