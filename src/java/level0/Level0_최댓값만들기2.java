package java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_최댓값만들기2 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, -3, 4, -5};
        int[] test2 = {0, -31, 24, 10, 1, 9};
        int[] test3 = {10, 20, 30, 5, 5, 20, 5};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] numbers) {
        List<Integer> resultList = new ArrayList<>();
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    resultList.add(list.get(i) * list.get(j));
                }
            }
        }
        return resultList.stream().mapToInt(Integer::intValue).max().getAsInt();
    }
}
