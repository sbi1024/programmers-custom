package _java.level1;

import java.util.Arrays;

public class Level1_x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        // TODO 연산시 캐스팅 개념에 대한 확립이 필요해 보인다.
        long[] solution1 = solution(2, 5);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        long[] solution2 = solution(4, 3);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        long[] solution3 = solution(-4, 2);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
        //
        long[] solution4 = solution(10000000, 1000);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = ((long) x * (i + 1));
        }
        return answer;
    }
}
