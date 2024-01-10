package level1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Level1_K번째수 {
    public static void main(String[] args) {
        int[] test1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] test2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [5, 6, 3]
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> arrList = Arrays.stream(array).boxed().collect(Collectors.toList());
        for (int i = 0; i < commands.length; i++) {
            answer[i] = arrList.subList(commands[i][0] - 1, commands[i][1]).stream()
                    .sorted()
                    .collect(Collectors.toList())
                    .get(commands[i][2] - 1);
        }
        return answer;
    }
}
