package _java.level0;

public class Level0_양꼬치 {
    public static void main(String[] args) {
        int solution1 = solution(10, 3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(64, 6);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n, int k) {
        int discount = 0;
        int mod = n / 10;
        if (mod > 0) {
            discount = mod * 2000;
        }
        return  (n * 12000) + (k * 2000) - discount;
    }
}
