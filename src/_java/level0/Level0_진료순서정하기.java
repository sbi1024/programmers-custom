package _java.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Level0_진료순서정하기 {
    public static void main(String[] args) {
        int[] test1 = {3, 76, 24};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7};
        int[] test3 = {30, 10, 23, 6, 100};

        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Integer[] integerEmergencyArray = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(integerEmergencyArray, Collections.reverseOrder());
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < integerEmergencyArray.length; j++) {
                if (emergency[i] == integerEmergencyArray[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }
        return answer;
    }
}
