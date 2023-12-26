package level0;

public class Level0_특별한이차원배열2 {
    public static void main(String[] args) {
        int[][] test1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}}; // 1
        int[][] test2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}}; // 0

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int arrFirstValue = arr[i][j];
                int arrSecondValue = arr[j][i];
                if (arrFirstValue != arrSecondValue) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
