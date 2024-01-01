package level0;

public class Level0_가까운1찾기 {
    public static void main(String[] args) {
        int[] test1 = {0, 0, 0, 1};
        int idx1 = 1;
        int solution1 = solution(test1, idx1);
        System.out.println("solution1 = " + solution1);

        int[] test2 = {1, 0, 0, 1, 0, 0};
        int idx2 = 4;
        int solution2 = solution(test2, idx2);
        System.out.println("solution2 = " + solution2);

        int[] test3 = {1, 1, 1, 1, 0};
        int idx3 = 3;
        int solution3 = solution(test3, idx3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
