package java.level0;

public class Level0_중복된숫자개수 {
    public static void main(String[] args) {
        int[] test1 = {1, 1, 2, 3, 4, 5};
        int[] test2 = {0, 2, 3, 4};

        int solution1 = solution(test1, 1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, 1);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if (i == n) {
                answer += 1;
            }
        }
        return answer;
    }
}
