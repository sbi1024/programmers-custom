package java.level0;

public class Level0_최빈값구하기 {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,3,3,4};
        int[] test2 = {1,1,2,2};
        int[] test3 = {1};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] array) {
        int answer = 0;
        int frequency = Integer.MIN_VALUE;

        int[] indexArray = new int[1001];
        for (int i = 0; i < array.length; i++) {
            indexArray[array[i]]++;
        }
        for (int i = 0; i < indexArray.length; i++) {
            int indexInt = indexArray[i];
            if (frequency < indexInt) {
                frequency = indexInt;
                answer = i;
            }
        }

        int count = 0;
        for (int indexValue : indexArray) {
            if (indexValue == frequency) {
                count++;
            }
            if (count > 1) {
                return -1;
            }
        }
        return answer;
    }
}
