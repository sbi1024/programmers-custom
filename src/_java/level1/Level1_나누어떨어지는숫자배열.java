package _java.level1;

import java.util.Arrays;

public class Level1_나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] test1 = {5, 9, 7, 10};
        int[] test2 = {2, 36, 1, 3};
        int[] test3 = {3, 2, 6};

        int[] solution1 = solution(test1, 5); // [5, 10]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, 1); // [1, 2, 3, 36]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(test3, 10); // [-1]
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(value -> value % divisor == 0).sorted().toArray();
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
