package _java.level0;

import java.util.Arrays;

public class Level0_PCCE기출문제5번산책 {
    public static void main(String[] args) {
        int[] solution1 = solution("NSSNEWWN");
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        int[] solution2 = solution("EESEEWNWSNWWNS");
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
