package level0;

import java.util.Arrays;
import java.util.Stack;

public class Level0_배열만들기4 {
    public static void main(String[] args) {
        int[] test1 = {1, 4, 2, 5, 3};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.size() != 0 && stack.peek() >= arr[i]) {
                stack.pop();
                i--;
            } else if (stack.size() != 0 && stack.peek() < arr[i]) {
                stack.push(arr[i]);
            } else if (stack.size() == 0) {
                stack.push(arr[i]);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}
