package _java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level0_할일목록 {
    public static void main(String[] args) {
        String[] test1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] test2 = {true, false, true, false};
        String[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) {
                list.add(todo_list[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
