package _java.level2;

import java.util.Arrays;

public class Level2_n2배열자르기 {
    // TODO 문제에서 대놓고 함정을 파놨다, 제한사항을 다시 잘 읽고 시간복잡도를 판단후 문제 접근의 방향성을 잡아야 할 것 같다.
    // TODO 자바의 기초인 연산순서에 대한 깊은 학습이 필요해 보인다. 이부분이 항상 지금 계속 흔들리고 있다.
    public static void main(String[] args) {
        int[] solution1 = solution(3, 2, 5);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [3,2,2,3]

        int[] solution2 = solution(4, 7, 14);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [4,3,3,3,4,4,4,4]
    }

    // 배열 index 값의 row ,col 값을 통해 해당 value 값을 추론할 수 있음
    // 예를든다면, 0,2 위치에 있는값은 Max(0,2) 값의 2 + 1 값을 통해 3 값이라는 추론이 가능함
    // 문제에서 주어진 left ~ right 값을 찾을때, left right 값을 통해 인덱스를 추론한다면
    // value 값 또한 추론이 가능함
    // 이 문제에서의 포인트는 index 값을 어떻게 추론해서 값을 뽑아낼 것인지가 포인트임

    public static int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) (right - left) + 1];

        int indexCount = 0;
        for (long i = left; i <= right; i++) {
            int row = (int) (i / n) + 1;
            int col = (int) (i % n) + 1;
            answer[indexCount] = Math.max(row, col);
            indexCount++;
        }

        return answer;
    }
}
