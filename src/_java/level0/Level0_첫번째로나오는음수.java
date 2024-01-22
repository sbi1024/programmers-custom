package _java.level0;

import java.util.stream.IntStream;

public class Level0_첫번째로나오는음수 {
    public static void main(String[] args) {
        int[] test1 = {12, 4, 15, 46, 38, -2, 15};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int[] test2 = {13, 22, 53, 24, 15, 6};
        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] num_list) {
        int answer = -1;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) {
                return i;
            }
        }
        return answer;
    }

    public static int solution1(int[] num_list) {
        return IntStream.range(0, num_list.length)
                .filter(value -> num_list[value] < 0)
                .findFirst()
                .orElse(-1);
    }

}
