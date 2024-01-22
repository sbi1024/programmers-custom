package _java.level0;

import java.util.Arrays;

public class Level0_배열의유사도 {
    public static void main(String[] args) {
        String[] test1 = {"a", "b", "c"};
        String[] test2 = {"n", "omg"};
        String[] test3 = {"com", "b", "d", "p", "c"};
        String[] test4 = {"m", "dot"};

        int solution1 = solution(test1, test3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, test4);
        System.out.println("solution2 = " + solution2);

    }

    public static int solution(String[] s1, String[] s2) {
        int[] result = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) {
                    result[i]++;
                }
            }
        }
        return Arrays.stream(result).sum();
    }
}
