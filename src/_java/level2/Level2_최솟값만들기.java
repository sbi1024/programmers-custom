package _java.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Level2_최솟값만들기 {
    // TODO Level1 에서는 PriorityQueue를 이용했다면, 아주 극찬을 받았을텐데, Level2 부터는 정렬에 대한 로직을 직접 구성하는구나
    // TODO 퀵 정렬에 대한 로직을 한번 여기서 연습해보면 좋을거 같다.
    public static void main(String[] args) {
        int[] test1 = {1, 4, 2};
        int[] test2 = {5, 4, 4};
        int solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        int[] test3 = {1, 2};
        int[] test4 = {3, 4};
        int solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] A, int[] B) {
        int answer = 0;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : A) pq1.add(a);
        for (int b : B) pq2.add(b);

        for (int i = 0; i < A.length; i++) {
            answer += pq1.poll() * pq2.poll();
        }

        return answer;
    }
}
