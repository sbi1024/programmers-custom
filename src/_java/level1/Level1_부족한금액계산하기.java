package _java.level1;

public class Level1_부족한금액계산하기 {
    public static void main(String[] args) {
        // 3	20	4	10
        long solution1 = solution(3, 20, 4);
        System.out.println("solution1 = " + solution1);
    }

    public static long solution(int price, int money, int count) {
        long answer = 0;

        for (int i = 1; i <= count; i++) {
            answer += ((long) price * i);
        }

        if (money >= answer) {
            return 0;
        }

        return Math.abs(answer - money);
    }
}
