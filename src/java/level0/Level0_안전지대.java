package java.level0;

import java.util.Arrays;

public class Level0_안전지대 {
    public static void main(String[] args) {
        // TODO 다시 풀이 필요
        int test1[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int test2[][] = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        int test3[][] = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[][] board) {
        int[][] resultArray = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int num = board[i][j];
                if (num == 1) {
                    for (int a = -1; a <= 1; a++) {
                        for (int b = -1; b <= 1; b++) {
                            try {
                                resultArray[i + a][j + b] = 1;
                            } catch (ArrayIndexOutOfBoundsException e) {
                                continue;
                            }
                        }
                    }
                }
            }
        }
        return (int) Arrays.stream(resultArray).map(value -> Integer.valueOf(String.valueOf(value))).count();
    }
}
