package _java.level0;

import java.util.Arrays;

public class Level0_캐릭터의좌표 {
    public static void main(String[] args) {
        String[] test1 = {"left", "right", "up", "right", "right"};
        String[] test2 = {"down", "down", "down", "down", "down"};
        int[] test3 = {11, 11};
        int[] test4 = {7, 9};

        int[] solution1 = solution(test1, test3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        int xLimit = board[0] / 2;
        int yLimit = board[1] / 2;

        for (String key : keyinput) {
            if (key.equals("up")) {
                if (!(answer[1] == Math.floor(yLimit))) {
                    answer[1]++;
                }
            } else if (key.equals("down")) {
                if (!(answer[1] == -Math.floor(yLimit))) {
                    answer[1]--;
                }
            } else if (key.equals("left")) {
                if (!(answer[0] == -Math.floor(xLimit))) {
                    answer[0]--;
                }
            } else if (key.equals("right")) {
                if (!(answer[0] == Math.floor(xLimit))) {
                    answer[0]++;
                }
            }
        }
        return answer;
    }
}
