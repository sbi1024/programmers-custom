package _java.level0;

import java.util.Arrays;

public class Level0_정사각형으로만들기 {
    public static void main(String[] args) {
        int[][] test1 = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        // [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
        int[][] test2 = {{57, 192, 534, 2}, {9, 345, 192, 999}};
        // [[57, 192, 534, 2], [9, 345, 192, 999], [0, 0, 0, 0], [0, 0, 0, 0]]
        int[][] test3 = {{1, 2}, {3, 4}};
        // 	[[1, 2], [3, 4]]

        int[][] solution1 = solution(test1);
        System.out.println("Arrays.deepToString(solution1) = " + Arrays.deepToString(solution1));

        int[][] solution2 = solution(test2);
        System.out.println("Arrays.deepToString(solution2) = " + Arrays.deepToString(solution2));

        int[][] solution3 = solution(test3);
        System.out.println("Arrays.deepToString(solution3) = " + Arrays.deepToString(solution3));
    }

    public static int[][] solution(int[][] arr) {
        int[][] answer = {};
        // 행의 길이
        int rowLength = arr.length;
        // 열의 길이
        int colLength = arr[0].length;
        // 1. 행의 숫자 > 열의 숫자 = 열의 숫자를 행의 숫자에 길이를 맞춘다, 이떄 0값으로 초기화한 배열로 채운다
        if (rowLength > colLength) {
            answer = new int[rowLength][rowLength];
        }
        // 2. 열의 숫자 > 행의 숫자 = 행의 숫자를 열의 숫자에 길이를 맞춘다, 이떄 0값으로 초기화한 배열로 채운다
        else if (rowLength < colLength) {
            answer = new int[colLength][colLength];
        }
        // 3. 행의 숫자 = 열의 숫자
        else {
            answer = new int[rowLength][colLength];
        }
        // 반복문을 통해 배열에 값을 할당한다.
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        // return
        return answer;
    }


}
