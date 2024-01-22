package _java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Level1_대충만든자판 {
    public static void main(String[] args) {
        String[] test1 = {"ABACD", "BCEFD"};
        String[] test2 = {"ABCD", "AABB"};
        int[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [9, 4]

        String[] test3 = {"AA"};
        String[] test4 = {"B"};
        int[] solution2 = solution(test3, test4);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        String[] test5 = {"AGZ", "BSSS"};
        String[] test6 = {"ASA", "BGZ"};
        int[] solution3 = solution(test5, test6);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            char[] targetCharArray = targets[i].toCharArray();
            for (int j = 0; j < targetCharArray.length; j++) {
                Set<Integer> set = new TreeSet<>();
                for (String key : keymap) {
                    int charIndex = key.indexOf(targetCharArray[j]);
                    if (charIndex != -1) {
                        set.add(charIndex);
                    }
                }
                if (set.size() == 0) {
                    count = -1;
                    break;
                } else {
                    ArrayList<Integer> list = new ArrayList<>(set);
                    Integer minIndex = list.get(0);
                    count += minIndex + 1;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
