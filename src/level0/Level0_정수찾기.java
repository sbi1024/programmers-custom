package level0;

public class Level0_정수찾기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {15, 98, 23, 2, 15};

        int solution1 = solution(test1, 3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, 20);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int num : num_list) {
            if (num == n) {
                return 1;
            }
        }
        return answer;
    }
}
