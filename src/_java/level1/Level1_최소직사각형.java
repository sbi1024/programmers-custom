package _java.level1;

public class Level1_최소직사각형 {
    // TODO 좀더 생각해서 반복문 하나에 처리해보자
    public static void main(String[] args) {
        int[][] test1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] test2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] test3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[][] sizes) {
        for (int[] size : sizes) {
            int max = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            size[0] = max;
            size[1] = min;
        }

        int firstMaxValue = Integer.MIN_VALUE;
        int secondMaxValue = Integer.MIN_VALUE;
        for (int[] size : sizes) {
            if (size[0] > firstMaxValue) {
                firstMaxValue = size[0];
            }
            if (size[1] > secondMaxValue) {
                secondMaxValue = size[1];
            }
        }
        return firstMaxValue * secondMaxValue;
    }
}
