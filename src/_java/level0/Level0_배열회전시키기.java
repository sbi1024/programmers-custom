package _java.level0;

import java.util.Arrays;

public class Level0_배열회전시키기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {4, 455, 6, 4, -1, 45, 6};

        int[] solution1 = solution(test1, "right");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, "left");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] numbers, String direction) {
        int temp;
        if (direction.equals("left")) {
            temp = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                numbers[i - 1] = numbers[i];
            }
            numbers[numbers.length - 1] = temp;
        } else {
            temp = numbers[numbers.length - 1];
            for (int i = numbers.length - 2; i >= 0; i--) {
                numbers[i + 1] = numbers[i];
            }
            numbers[0] = temp;
        }
        return numbers;
    }

    public static int[] solution1(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if (direction.equals("left")) {
            answer[numbers.length - 1] = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                answer[i - 1] = numbers[i];
            }
        }
        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int i = 0; i < numbers.length - 1; i++) {
                answer[i + 1] = numbers[i];
            }
        }
        return answer;
    }
}
