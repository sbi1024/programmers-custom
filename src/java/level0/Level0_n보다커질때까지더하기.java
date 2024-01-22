package java.level0;

public class Level0_n보다커질때까지더하기 {
    public static void main(String[] args) {
        int[] test1 = {34, 5, 71, 29, 100, 34};
        int[] test2 = {58, 44, 27, 10, 100};

        int solution1 = solution(test1, 123);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, 139);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            if (answer > n) {
                break;
            }
            answer += number;
        }
        return answer;
    }
}
