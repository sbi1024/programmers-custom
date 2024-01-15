package level1;

public class Level1_약수의개수와덧셈 {
    public static void main(String[] args) {
        // 13	17	43
        // 24	27	52
        int solution1 = solution(13, 17);
        System.out.println("solution1 = " + solution1); // 43

        int solution2 = solution(24, 27);
        System.out.println("solution2 = " + solution2); // 52
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
