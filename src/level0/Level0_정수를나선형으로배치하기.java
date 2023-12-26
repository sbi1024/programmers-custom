package level0;

import java.util.Arrays;

public class Level0_정수를나선형으로배치하기 {
    public static void main(String[] args) {

        int[][] solution1 = solution(4);
        System.out.println("solution1 = " + Arrays.deepToString(solution1));

        int[][] solution2 = solution(5);
        System.out.println("solution2 = " + Arrays.deepToString(solution2));

        // n	result

        // 4	[[1, 2, 3, 4],
        //      [12, 13, 14, 5],
        //      [11, 16, 15, 6],
        //      [10, 9, 8, 7]]
        // 5	[[1, 2, 3, 4, 5],
        //      [16, 17, 18, 19, 6],
        //      [15, 24, 25, 20, 7],
        //      [14, 23, 22, 21, 8],
        //      [13, 12, 11, 10, 9]]



        // [[13, 14, 15, 16],
        // [12, 0, 0, 5],
        // [11, 0, 0, 6],
        // [10, 9, 8, 7]]
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
                col++;
                if ((answer[row][col] != 0) || col == n - 1) {
                    direction = "d";
                }
            } else if (direction.equals("d")) {
                row++;
                if ((answer[row][col] != 0) || row == n - 1) {
                    direction = "l";
                }
            } else if (direction.equals("l")) {
                col--;
                if ((answer[row][col] != 0) || col == 0) {
                    direction = "u";
                }
            } else if (direction.equals("u")) {
                row--;
                if ((answer[row][col] != 0) || row == 0) {
                    direction = "r";
                }
            }
        }

        return answer;
    }
}
