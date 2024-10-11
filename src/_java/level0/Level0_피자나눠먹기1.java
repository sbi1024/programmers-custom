package _java.level0;

public class Level0_피자나눠먹기1 {
    public static void main(String[] args) {
        int solution1 = solution(7);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(1);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(15);
        System.out.println("solution3 = " + solution3);

        int solution4 = solution(100);
        System.out.println("solution4 = " + solution4);
    }

    public static int solution(int n) {
        return (n / 7) + (n % 7 >= 1 ? 1 : 0);
    }
}
