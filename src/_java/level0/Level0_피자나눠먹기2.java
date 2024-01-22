package _java.level0;

public class Level0_피자나눠먹기2 {
    public static void main(String[] args) {
        int solution1 = solution(6);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(10);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(4);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int n) {
        int answer = 1;
        while (true) {
            if (((6 * answer) % n) == 0) {
                return answer;
            } else {
                answer++;
            }
        }
    }
}
