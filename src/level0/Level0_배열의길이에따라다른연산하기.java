package level0;

import java.util.Arrays;

public class Level0_배열의길이에따라다른연산하기 {
    public static void main(String[] args) {
        int[] test1 = {49, 12, 100, 276, 33};
        int[] solution1 = solution(test1, 27); // [76, 12, 127, 276, 60]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {444, 555, 666, 777};
        int[] solution2 = solution(test2, 100); // [444, 655, 666, 877]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}
