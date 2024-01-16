package level1;

import java.util.Stack;

public class Level1_햄버거만들기 {
    // TODO StringBuffer 를 통해 문제를 풀고자 했으나, 실패
    // Stack 으로 문제 풀이 방향 변화 시도
    public static void main(String[] args) {
        // [2, 1, 1, 2, 3, 1, 2, 3, 1]	2
        // [1, 3, 2, 1, 2, 1, 3, 1, 2]	0
        // 1 : 빵
        // 2 : 야채
        // 3 : 고기
        // 1 : 빵
        // 무조건 1 2 3 1 순이 되어야 햄버거 하나를 포장 가능

        int[] test1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int[] test2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i : ingredient) {
            stack.push(i);
            int stackSize = stack.size();
            if (stackSize >= 4) {
                if (stack.get(stackSize - 4).equals(1) &&
                        stack.get(stackSize - 3).equals(2) &&
                        stack.get(stackSize - 2).equals(3) &&
                        stack.get(stackSize - 1).equals(1)) {
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    answer++;
                }
            }
        }


        return answer;
    }
}
