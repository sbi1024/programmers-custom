package _java.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level2_영어끝말잇기 {
    public static void main(String[] args) {
        String[] test1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};    // {3,3}
        int[] solution1 = solution(3, test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] test2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};    // {0,0}
        int[] solution2 = solution(5, test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));

        String[] test3 = {"hello", "one", "even", "never", "now", "world", "draw"}; //	{1,3}
        int[] solution3 = solution(2, test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3));

        String[] test4 = {"hello", "one", "even", "never", "row", "corld", "draw"}; //	{2,3}
        int[] solution4 = solution(2, test4);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4));

        String[] test5 = {"hello", "one", "even", "never", "row", "w", "draw"}; //	{2,3}
        int[] solution5 = solution(2, test5);
        System.out.println("Arrays.toString(solution5) = " + Arrays.toString(solution5));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Integer> map = new HashMap<>();
        map.put(words[0], 1);
        String standard = words[0];

        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            int wordLength = word.length();
            int standardLength = standard.length();

            if ((map.get(word) != null) || (standard.charAt(standardLength - 1) != word.charAt(0)) || (wordLength == 1)) {
                int mod = (i + 1) / n;
                int remain = (i + 1) % n;
                if (remain == 0) {
                    answer[0] = n;
                    answer[1] = mod;
                } else {
                    answer[0] = remain;
                    answer[1] = mod + 1;
                }
                return answer;
            }

            map.put(word, i + 1);
            standard = word;
        }

        return answer;
    }
}
