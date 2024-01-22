package java.level0;

import java.util.Arrays;
public class Level0_정수를나선형으로배치하기 {
    public static void main(String[] args) {

        int[][] solution1 = solution(4);
        System.out.println("solution1 = " + Arrays.deepToString(solution1));

        int[][] solution2 = solution(5);
        System.out.println("solution2 = " + Arrays.deepToString(solution2));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int count = 0;
        int pow = (int) Math.pow(n, 2);
        int row = 0;
        int col = 0;
        String direction = "r";

        while (count < pow) {
            count++;
            answer[row][col] = count;
            if (direction.equals("r")) {
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = "d";
                    row++;
                } else {
                    col++;
                }
            } else if (direction.equals("d")) {
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = "l";
                    col--;
                } else {
                    row++;
                }
            } else if (direction.equals("l")) {
                if (col == 0 || answer[row][col - 1] != 0) {
                    direction = "u";
                    row--;
                } else {
                    col--;
                }
            } else if (direction.equals("u")) {
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = "r";
                    col++;
                } else {
                    row--;
                }
            }
        }

        return answer;
    }
}
