package _java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Level0_등수매기기 {
    public static void main(String[] args) {
        int[][] test1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[][] test2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            tempList.add(score[i][0] + score[i][1]);
        }

        tempList.sort(Comparator.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            answer[i] = tempList.indexOf(score[i][0] + score[i][1]) + 1;
        }

        return answer;
    }
}
