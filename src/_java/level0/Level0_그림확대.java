package _java.level0;

import java.util.Arrays;

public class Level0_그림확대 {
    public static void main(String[] args) {
        String[] test1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        String[] solution1 = solution(test1, 2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

        String[] test2 = {"x.x", ".x.", "x.x"};
        String[] solution2 = solution(test2, 3);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2));
    }

    public static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for (int i = 0; i < picture.length * k; i += k) {
            String tempStr = "";
            String[] pic = picture[i / k].split("");
            for (int j = 0; j < pic.length; j++) {
                for (int e = 0; e < k; e++) {
                    tempStr += pic[j];
                }
                int count = 0;
                while (count < k) {
                    answer[i + count] = tempStr;
                    count++;
                }
            }
        }
        return answer;
    }
}
