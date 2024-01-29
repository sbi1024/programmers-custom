package _java.level2;

import java.util.*;

public class Level2_기능개발 {
    // TODO 나쁘지 않게 푼거같음, 그런데도 이 찜찜함은 무엇일까..
    public static void main(String[] args) {
        // [93, 30, 55]	[1, 30, 5]	[2, 1]
        // [95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
        int[] test1 = {93, 30, 55};
        int[] test2 = {1, 30, 5};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test3 = {95, 90, 99, 99, 80, 99};
        int[] test4 = {1, 1, 1, 1, 1, 1};
        int[] solution2 = solution(test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        int progressIndex = 0;
        Integer[] tempProgresses = new Integer[progresses.length];
        for (int i = 0; i < progresses.length; i++) tempProgresses[i] = progresses[i];
        Queue<Integer> queue = new LinkedList<>();
        for (Integer temp : tempProgresses) queue.add(temp);
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            for (int i = progressIndex; i < tempProgresses.length; i++) tempProgresses[i] += speeds[i];
            if (tempProgresses[progressIndex] >= 100) {
                int count = 0;
                while (tempProgresses[progressIndex] >= 100) {
                    queue.poll();
                    progressIndex++;
                    count++;
                    if (progressIndex == tempProgresses.length) {
                        break;
                    }
                }
                list.add(count);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
