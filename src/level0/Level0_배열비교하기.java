package level0;

import java.util.Arrays;

public class Level0_배열비교하기 {
    public static void main(String[] args) {
        int[] test1 = {49, 13};
        int[] test2 = {70, 11, 2}; // -1
        int solution1 = solution(test1, test2);
        System.out.println("solution1 = " + solution1);

        int[] test3 = {100, 17, 84, 1};
        int[] test4 = {55, 12, 65, 36}; // 1
        int solution2 = solution(test3, test4);
        System.out.println("solution2 = " + solution2);

        int[] test5 = {1, 2, 3, 4, 5};
        int[] test6 = {3, 3, 3, 3, 3}; // 0
        int solution3 = solution(test5, test6);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] arr1, int[] arr2) {
        int firstLength = arr1.length;
        int secondLength = arr2.length;
        if (firstLength > secondLength) {
            return 1;
        } else if (firstLength == secondLength) {
            int sum1 = Arrays.stream(arr1).sum();
            int sum2 = Arrays.stream(arr2).sum();
            if (sum1 > sum2) {
                return 1;
            } else if (sum1 == sum2) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

}
