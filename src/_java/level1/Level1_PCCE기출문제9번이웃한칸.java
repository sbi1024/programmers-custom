package _java.level1;

public class Level1_PCCE기출문제9번이웃한칸 {
    public static void main(String[] args) {
        String[][] test1 = {
                {"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}
        };
        int solution1 = solution(test1, 1, 1);
        System.out.println("solution1 = " + solution1); // 2

        String[][] test2 = {
                {"yellow", "green", "blue"},
                {"blue", "green", "yellow"},
                {"yellow", "blue", "blue"}
        };
        int solution2 = solution(test2, 0, 1);
        System.out.println("solution2 = " + solution2); // 1
    }

    public static int solution(String[][] board, int h, int w) {
        // 상 row - 1
        // 하 row + 1
        // 좌 col - 1
        // 우 col + 1

        int answer = 0;

        String standColor = board[h][w];
        int boardLength = board.length - 1;

        int x1 = h - 1;
        int y1 = w;
        boolean checkOutIndex1 = checkOutIndex(boardLength, x1, y1);
        if (checkOutIndex1 == true) {
            if (board[x1][y1].equals(standColor)) {
                answer++;
            }
        }

        int x2 = h + 1;
        int y2 = w;
        boolean checkOutIndex2 = checkOutIndex(boardLength, x2, y2);
        if (checkOutIndex2 == true) {
            if (board[x2][y2].equals(standColor)) {
                answer++;
            }
        }

        int x3 = h;
        int y3 = w - 1;
        boolean checkOutIndex3 = checkOutIndex(boardLength, x3, y3);
        if (checkOutIndex3 == true) {
            if (board[x3][y3].equals(standColor)) {
                answer++;
            }
        }

        int x4 = h;
        int y4 = w + 1;
        boolean checkOutIndex4 = checkOutIndex(boardLength, x4, y4);
        if (checkOutIndex4 == true) {
            if (board[x4][y4].equals(standColor)) {
                answer++;
            }
        }

        return answer;
    }

    public static boolean checkOutIndex(int sizeLimit, int x, int y) {
        if (!(x >= 0 && x <= sizeLimit)) {
            return false;
        }

        if (!((y >= 0 && y <= sizeLimit))) {
            return false;
        }

        return true;
    }
}
