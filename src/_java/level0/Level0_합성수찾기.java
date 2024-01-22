package _java.level0;

public class Level0_합성수찾기 {
    public static void main(String[] args) {
        // TODO 다시풀기
        int solution1 = solution(10);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(15);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int answer = 0;
        int compositeNumberCnt = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    compositeNumberCnt++;
                    if (compositeNumberCnt >= 3) {
                        answer++;
                        break;
                    }
                }
            }
            compositeNumberCnt = 0;
        }

        return answer;
    }
}
