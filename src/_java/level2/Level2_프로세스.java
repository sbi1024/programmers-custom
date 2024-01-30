package _java.level2;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_프로세스 {
    public static void main(String[] args) {
        // [2, 1, 3, 2]	2	1
        // [1, 1, 9, 1, 1, 1]	0	5
        int[] test1 = {2, 1, 3, 2};
        int solution1 = solution(test1, 2);
        System.out.println("solution1 = " + solution1); // 1

        int[] test2 = {1, 1, 9, 1, 1, 1};
        int solution2 = solution(test2, 0);
        System.out.println("solution2 = " + solution2); // 5

        int[] test3 = {1, 4, 9, 1, 5, 10};
        int solution3 = solution(test3, 0);
        System.out.println("solution3 = " + solution3); // 5
    }

    public static int solution(int[] priorities, int location) {
        int answer = 1;

        Queue<Integer> queue = new LinkedList<>();
        for (int priority : priorities) queue.add(priority);

        while (!queue.isEmpty()) {
            Integer standValue = queue.peek();
            Integer[] remainArray = queue.toArray(new Integer[0]);
            boolean checkStatus = false;
            for (int i = 1; i < remainArray.length; i++) {
                if (remainArray[i] > standValue) {
                    checkStatus = true;
                    break;
                }
            }

            if (checkStatus) {
                queue.poll();
                queue.add(standValue);
            } else {
                queue.poll();
                if (location == 0) return answer;
                answer++;
            }

            location--;
            if (location < 0) location = queue.size() - 1;
        }

        return answer;
    }
}
