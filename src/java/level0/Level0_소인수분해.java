package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_소인수분해 {
    public static void main(String[] args) {
        // TODO 다시 풀어보기
        int[] solution1 = solution(12);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(17);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(420);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int n) {
        List<Integer> answerList = new ArrayList();
        int[] primNumberArray = getPrimNumberArray(n);
        for (int i = 0; i < primNumberArray.length; i++) {
            if (n % primNumberArray[i] == 0) {
                answerList.add(primNumberArray[i]);
            }
        }
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] getPrimNumberArray(int n) {
        List<Integer> primeNumberList = new ArrayList<>();
        int count = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                primeNumberList.add(i);
            }
            count = 0;
        }
        return primeNumberList.stream().mapToInt(Integer::intValue).toArray();
    }
}
