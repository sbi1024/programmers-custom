package level0;

public class Level0_이차원배열대각선순회하기 {
    public static void main(String[] args) {
        int[][] test1 = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int solution1 = solution(test1, 2);
        System.out.println("solution1 = " + solution1); // 8
    }

    // {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}}	2	8
    public static int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i+j <= k){
                    answer+= board[i][j];
                }
            }
        }
        return answer;
    }
}
