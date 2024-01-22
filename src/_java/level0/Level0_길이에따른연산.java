package _java.level0;

public class Level0_길이에따른연산 {
    public static void main(String[] args) {
        int[] test1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}; // 51
        int[] test2 = {2, 3, 4, 5}; // 120

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }
        return answer;
    }
}
