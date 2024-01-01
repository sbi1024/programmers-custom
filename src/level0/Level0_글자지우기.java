package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Level0_글자지우기 {
    public static void main(String[] args) {
        String test1 = "apporoograpemmemprs";
        int[] test2 = {1, 16, 6, 15, 0, 10, 11, 3};
        String solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);
    }

    public static String solution(String my_string, int[] indices) {
        indices = Arrays.stream(indices).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
        List<String> list = Arrays.stream(my_string.split("")).collect(Collectors.toList());

        for (int index : indices) {
            list.remove(index);
        }

        return String.join("", list);
    }
}
