package java.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level1_추억점수 {
    public static void main(String[] args) {

        String[] test1 = {"may", "kein", "kain", "radi"};
        int[] test2 = {5, 10, 1, 3};
        String[][] test3 = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] solution1 = solution(test1, test2, test3);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [19, 15, 6]

        String[] test4 = {"kali", "mari", "don"};
        int[] test5 = {11, 1, 55};
        String[][] test6 = {{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}};
        int[] solution2 = solution(test4, test5, test6);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [67, 0, 55]

        String[] test7 = {"may", "kein", "kain", "radi"};
        int[] test8 = {5, 10, 1, 3};
        String[][] test9 = {{"may"}, {"kein", "deny", "may"}, {"kon", "coni"}};
        int[] solution3 = solution(test7, test8, test9);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // [5, 15, 0]
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) map.put(name[i], yearning[i]);

        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (int j = 0; j < photo[i].length; j++) {
                sum += map.getOrDefault(photo[i][j], 0);
            }
            answer[i] = sum;
        }
        return answer;
    }
}
