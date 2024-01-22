package java.level1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Level1_명예의전당1 {
    // TODO Collection.sort(list) 부분이 마음에 안듬, k값에 따라 정렬을 해야하는 범위가 달라짐
    // PriorityQueue 첫 사용 성공
    public static void main(String[] args) {
        int[] test1 = {10, 100, 20, 150, 1, 100, 200};
        int[] solution1 = solution(3, test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [10, 10, 10, 20, 20, 100, 100]

        int[] test2 = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] solution2 = solution(4, test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    }

    public static int[] solution(int k, int[] score) {
        int scoreLength = score.length;
        int[] answer = new int[scoreLength];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < scoreLength; i++) {
            int scoreValue = score[i];
            pq.add(scoreValue);
            if (pq.size() > k) {
                pq.poll();
            }
            answer[i] = pq.peek();
        }
        return answer;
    }
}
