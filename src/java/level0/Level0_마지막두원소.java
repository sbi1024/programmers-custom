package java.level0;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_마지막두원소 {
    public static void main(String[] args) {
        int[] test1 = {2, 1, 6};
        int[] solution1 = solution(test1); // [2, 1, 6, 5]
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] test2 = {5, 2, 1, 7, 5};
        int[] solution2 = solution(test2); // [5, 2, 1, 7, 5, 10]
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Integer lastValue = list.get(list.size() - 1);
        Integer lastSecondValue = list.get(list.size() - 2);
        if (lastValue > lastSecondValue) {
            list.add(lastValue - lastSecondValue);
        } else {
            list.add(lastValue * 2);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
