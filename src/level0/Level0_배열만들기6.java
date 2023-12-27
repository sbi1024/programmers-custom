package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_배열만들기6 {
    // TODO STACK 자료구조로 풀어보기
    public static void main(String[] args) {
        int[] test1 = {0, 1, 1, 1, 0};
        int[] solution1 = solution(test1); // [0, 1, 0]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {0, 1, 0, 1, 0};
        int[] solution2 = solution(test2); // [0, 1, 0, 1, 0]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        int[] test3 = {0, 1, 1, 0};
        int[] solution3 = solution(test3); // [-1]
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {-1};
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (list.size() == 0) {
                list.add(arr[i]);
            } else if (list.size() != 0 && list.get(list.size() - 1) == arr[i]) {
                list.remove(list.size() - 1);
            } else if (list.size() != 0 && list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        if (list.size() == 0) {
            return answer;
        } else {
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
