package _java.level2;

import java.util.Arrays;

public class Level2_뒤에있는큰수찾기 {
    // TODO 익숙해졌다고 생각했는데 아직도 시간복잡도를 고려해서 풀지 않았다.
    // TODO 날코딩이 아닌 충분한 생각 및 분석후 문제 접근이 필요해 보인다.
    public static void main(String[] args) {
        int[] test1 = {2, 3, 3, 5};
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {9, 1, 5, 3, 6, 2};
        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);

        // 배열의 마지막에서부터 값을 찾는 방법은 없을까 ?


        return answer;
    }

//    public static int[] solution(int[] numbers) {
//        int[] answer = new int[numbers.length];
//        for (int i = 0; i < answer.length; i++) answer[i] = -1;
//
//        for (int i = 0; i < numbers.length; i++) {
//            int standValue = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                int anotherValue = numbers[j];
//                if (standValue < anotherValue) {
//                    answer[i] = anotherValue;
//                    break;
//                }
//            }
//        }
//
//        return answer;
//    }
}
