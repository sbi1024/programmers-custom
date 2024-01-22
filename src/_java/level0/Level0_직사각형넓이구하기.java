package _java.level0;

import java.util.ArrayList;
import java.util.List;

public class Level0_직사각형넓이구하기 {
    public static void main(String[] args) {
        int[][] test1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int[][] test2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[][] dots) {
        List<Integer> xList = new ArrayList<>();
        List<Integer> yList = new ArrayList<>();

        for (int[] dot : dots) {
            int firstX = dot[0];
            int firstY = dot[1];
            xList.add(firstX);
            yList.add(firstY);
        }

        int maxX = xList.stream().mapToInt(Integer::intValue).max().getAsInt();
        int minX = xList.stream().mapToInt(Integer::intValue).min().getAsInt();
        int maxY = yList.stream().mapToInt(Integer::intValue).max().getAsInt();
        int minY = yList.stream().mapToInt(Integer::intValue).min().getAsInt();

        return (maxX - minX) * (maxY - minY);
    }
}
