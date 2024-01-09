package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Level0_짝수는싫어요 {
    public static void main(String[] args) {
        int[] solution1 = solution(10);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(15);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int n) {
        int[] answer = new int[n];

        List<Integer> oddNumberList = new ArrayList<>();

        for (int i = 0; i < answer.length; i++) {
            answer[i] = i + 1;
        }

        for (int i = 0; i < answer.length; i++) {
            int oddNumber = answer[i];
            if ((answer[i] % 2) != 0) {
                oddNumberList.add(oddNumber);
            }
        }
        Collections.sort(oddNumberList);
        answer = oddNumberList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
