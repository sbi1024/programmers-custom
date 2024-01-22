package java.level0;

import java.util.Arrays;

public class Level0_문자열묶기 {
    public static void main(String[] args) {
        String[] test1 = {"a", "bc", "d", "efg", "hi"};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(String[] strArr) {
        int answer = 0;
        int maxValue = Arrays.stream(strArr).mapToInt(value1 -> value1.length()).max().getAsInt();
        for (int i = 1; i <= maxValue; i++) {
            int length = i;
            int count = (int) Arrays.stream(strArr).filter(value1 -> value1.length() == length).count();
            if (count > answer) {
                answer = count;
            }
        }
        return answer;
    }

}
