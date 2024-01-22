package java.level0;

public class Level0_홀수vs짝수 {
    public static void main(String[] args) {
        int[] test1 = {4, 2, 6, 1, 7, 6}; // 17
        int[] test2 = {-1, 2, 5, 6, 3}; // 8

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] num_list) {
        int holSum = 0;
        int jakSum = 0;
        int[] plusNumList = new int[num_list.length + 1];
        System.arraycopy(num_list, 0, plusNumList, 1, num_list.length);

        for (int i = 1; i < plusNumList.length; i++) {
            if (i % 2 == 0) {
                jakSum += plusNumList[i];
            } else {
                holSum += plusNumList[i];
            }
        }

        return Math.max(holSum, jakSum);
    }
}
