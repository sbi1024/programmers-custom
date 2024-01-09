package level0;

public class Level0_피자나눠먹기1 {
    public static void main(String[] args) {
        int solution1 = solution(7);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(1);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(15);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int n) {
        int answer = 1;
        while (true) {
            int remain = (7 * answer) % n;
            if (remain == 0) {
                return answer;
            } else if (remain < 7) {
                return answer;
            } else {
                answer += 1;
            }
        }
    }
}
