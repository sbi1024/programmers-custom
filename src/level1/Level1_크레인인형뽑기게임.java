package level1;

import java.util.Stack;

public class Level1_크레인인형뽑기게임 {
    // TODO 혼자 생각해서 풀었는데, 다른사람들이링 비슷한 방향으로 잘 푼거 같음 
    // 방향성 잘 잡고 푼거같음
    public static void main(String[] args) {
        int[][] test1 = {
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 3},
                {0, 2, 5, 0, 1},
                {4, 2, 4, 4, 2},
                {3, 5, 1, 3, 1}
        };
        int[] test2 = {1, 5, 3, 5, 1, 2, 1, 4};

        int solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> resultStack = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int boardValue = board[j][moves[i] - 1];
                if (boardValue != 0) {
                    board[j][moves[i] - 1] = 0;
                    if (resultStack.isEmpty()) {
                        resultStack.push(boardValue);
                    } else {
                        Integer peekStack = resultStack.peek();
                        if (peekStack.equals(boardValue)) {
                            resultStack.pop();
                            answer += 2;
                        } else {
                            resultStack.push(boardValue);
                        }
                    }
                    break;
                }
            }
        }
        return answer;
    }
}
