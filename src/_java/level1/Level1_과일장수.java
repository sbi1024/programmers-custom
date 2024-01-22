package _java.level1;

import java.util.Arrays;
import java.util.Collections;

public class Level1_과일장수 {
    // TODO 아이디어 : 일반정렬후, 특정 인덱스값을 추출해서 계산하기 방식으로 풀이 변경 필요
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1, 2, 3, 1};
        int solution1 = solution(3, 4, test1);
        System.out.println("solution1 = " + solution1); // 8

        int[] test2 = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        int solution2 = solution(4, 3, test2);
        System.out.println("solution2 = " + solution2); // 33
    }

    public static int solution(int k, int m, int[] score) {
        int answer = 0;

        int[] reverseScore = Arrays.stream(score)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int count = 0;
        int minValue = k;
        for (int revScore : reverseScore) {
            count++;
            if (revScore < minValue) minValue = revScore;
            if (count == m) {
                answer += minValue * m;
                count = 0;
            }
        }

        return answer;
    }


}
