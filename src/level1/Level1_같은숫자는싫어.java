package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_같은숫자는싫어 {
    public static void main(String[] args) {
        int[] test1 = {1, 1, 3, 3, 0, 1, 1};
        int[] test2 = {4, 4, 4, 3, 3};

        int[] solution1 = solution(test1); // [1,3,0,1]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution(test2); // [4,3]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] arr) {
        // TODO 스택 버전으로도 한번 풀어봐야 할듯, 기준값으로 푸는 전략도 좋지만, 기존에 제공해주는 기본 자료구조를 지향해야함
        List<Integer> integerList = new ArrayList<>();
        int standardValue = -1;
        for (int a : arr) {
            if (a != standardValue) {
                integerList.add(a);
                standardValue = a;
            }
        }
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
