package level0;

import java.util.Arrays;

public class Level0_배열뒤집기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 1, 1, 1, 1, 2};
        int[] test3 = {1, 0, 1, 1, 1, 3, 5};

        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] num_list) {
        int index = 0;
        int length = num_list.length;
        int[] reverseNumArray = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            reverseNumArray[index] = num_list[i];
            index++;
        }
        return reverseNumArray;
    }
}
