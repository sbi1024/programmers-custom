package java.level1;

import java.util.Arrays;

public class Level1_바탕화면정리 {
    // TODO 속도는 빠른데, 아이디어가 좀 아쉬운듯
    public static void main(String[] args) {
        String[] test1 = {
                ".#...", // 0,1
                "..#..", // 1,2
                "...#." //  2,3 + 1씩// 3,4
        };
        int[] solution1 = solution(test1);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // [0, 1, 3, 4]

        String[] test2 = {
                "..........",
                ".....#....",
                "......##..",
                "...##.....",
                "....#....."
        };
        int[] solution2 = solution(test2);
        System.out.println("Arrays.toString(solution2) = " + Arrays.toString(solution2)); // [1, 3, 5, 8]

        String[] test3 = {
                ".##...##.",
                "#..#.#..#",
                "#...#...#",
                ".#.....#.",
                "..#...#..",
                "...#.#...",
                "....#...."
        };
        int[] solution3 = solution(test3);
        System.out.println("Arrays.toString(solution3) = " + Arrays.toString(solution3)); // [0, 0, 7, 9]

        String[] test4 = {
                "..",
                "#."
        };
        int[] solution4 = solution(test4);
        System.out.println("Arrays.toString(solution4) = " + Arrays.toString(solution4)); // [1, 0, 2, 1]
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            int wallPaperFirstIndex = wallpaper[i].indexOf("#");
            int wallPaperLastIndex = wallpaper[i].lastIndexOf("#");
            if (wallPaperFirstIndex != -1) {
                if (wallPaperFirstIndex < minIndex) {
                    minIndex = wallPaperFirstIndex;
                } else if (wallPaperFirstIndex > maxIndex) {
                    maxIndex = wallPaperFirstIndex;
                }
            }
            if (wallPaperLastIndex != -1) {
                if (wallPaperLastIndex < minIndex) {
                    minIndex = wallPaperLastIndex;
                } else if (wallPaperLastIndex > maxIndex) {
                    maxIndex = wallPaperLastIndex;
                }
            }
        }
        int startIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < wallpaper.length; i++) {
            int wallPaperIndex = wallpaper[i].indexOf("#");
            if (wallPaperIndex != -1) {
                startIndex = i;
                break;
            }
        }
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            int wallPaperIndex = wallpaper[i].indexOf("#");
            if (wallPaperIndex != -1) {
                lastIndex = i;
                break;
            }
        }
        answer[0] = startIndex;
        answer[1] = minIndex;
        answer[2] = lastIndex + 1;
        answer[3] = maxIndex + 1;

        return answer;
    }
}
