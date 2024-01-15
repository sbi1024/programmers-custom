package level1;

public class Level1_나머지가1이되는수찾기 {
    public static void main(String[] args) {
        int solution1 = solution(10);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(12);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if ((n - 1) % i == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
