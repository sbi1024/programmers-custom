package _java.level1;

import java.util.Arrays;

public class Level1_로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] test1 = {44, 1, 0, 0, 31, 25};
        int[] test2 = {31, 10, 45, 1, 6, 19};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test3 = {0, 0, 0, 0, 0, 0};
        int[] test4 = {38, 19, 20, 40, 15, 25};
        int[] solution2 = solution(test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] test5 = {45, 4, 35, 20, 3, 9};
        int[] test6 = {20, 9, 3, 45, 4, 35};
        int[] solution3 = solution(test5, test6);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int matchCount = 0;
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            } else {
                for (int winNum : win_nums) {
                    if (lotto == winNum) {
                        matchCount++;
                        break;
                    }
                }
            }
        }
        answer[0] = rank(matchCount + zeroCount);
        answer[1] = rank(matchCount);
        return answer;
    }

    public static int rank(int count) {
        int rank;
        switch (count) {
            case 6:
                rank = 1;
                break;
            case 5:
                rank = 2;
                break;
            case 4:
                rank = 3;
                break;
            case 3:
                rank = 4;
                break;
            case 2:
                rank = 5;
                break;
            default:
                rank = 6;
        }
        return rank;
    }
}
