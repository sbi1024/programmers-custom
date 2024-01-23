package _java.level2;

public class Level2_숫자의표현 {
    // TODO 무지성 반복문 지양하자, for의 2번쨰 조건문 필히 생각하고 작성하기
    public static void main(String[] args) {
        int solution1 = solution(15);
        System.out.println("solution1 = " + solution1); // 4

        int solution2 = solution(8);
        System.out.println("solution2 = " + solution2); // 1

        int solution3 = solution(9);
        System.out.println("solution3 = " + solution3); // 1
    }

    public static int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= n / 2; i++) {
            int sum = i;
            for (int j = i + 1; sum < n; j++) {
                sum += j;
            }
            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }
}
