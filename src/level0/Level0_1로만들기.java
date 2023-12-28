package level0;

public class Level0_1로만들기 {
    public static void main(String[] args) {
        int[] test1 = {12, 4, 15, 1, 14};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // 11
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            while (num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (num - 1) / 2;
                }
                answer++;
            }
        }
        return answer;
    }
}
