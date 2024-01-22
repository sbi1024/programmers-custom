package java.level0;

public class Level0_공배수 {
    public static void main(String[] args) {
        int solution1 = solution(60, 2, 3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(55, 10, 5);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int number, int n, int m) {
        if (number % n == 0 && number % m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
