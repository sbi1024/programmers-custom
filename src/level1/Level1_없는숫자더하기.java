package level1;

public class Level1_없는숫자더하기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 6, 7, 8, 0};
        int solution1 = solution(test1); // 14
        System.out.println("solution1 = " + solution1);

        int[] test2 = {5, 8, 4, 0, 6, 7, 9};
        int solution2 = solution(test2); // 6
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] numbers) {
        int answer = 45;
        for (int number : numbers) {
            for (int i = 0; i <= 9; i++) {
                if (number == i) {
                    answer -= number;
                    break;
                }
            }
        }
        return answer;
    }
}
