package level0;

import java.util.Arrays;

public class Level0_무작위로K개의수뽑기 {
    public static void main(String[] args) {
        int[] test1 = {0, 1, 1, 2, 2, 3};
        int[] solution1 = solution(test1, 3); // [0, 1, 2]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {0, 1, 1, 1, 1};
        int[] solution2 = solution(test2, 4); // [0, 1, -1, -1]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        answer = Arrays.stream(answer).map(value -> -1).toArray();
        int[] array = Arrays.stream(arr).boxed().distinct().mapToInt(Integer::intValue).toArray();
        System.arraycopy(array, 0, answer, 0, Math.min(answer.length, array.length));
        return answer;
    }
}
