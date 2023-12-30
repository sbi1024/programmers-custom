package level0;

import java.util.Arrays;

public class Level0_조건에맞게수열변환하기2 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 100, 99, 98};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length];
        while (!Arrays.equals(arr, temp)) {
            System.arraycopy(arr, 0, temp, 0, arr.length);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            answer++;
        }
        return answer - 1;
    }
}
