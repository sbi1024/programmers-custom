package level0;

import java.util.Arrays;
import java.util.Stack;

public class Level0_빈배열에추가삭제하기 {
    public static void main(String[] args) {
        int[] test1 = {3, 2, 4, 1, 3};
        boolean[] test2 = {true, false, true, false, false};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
