package _java.level0;

public class Level0_최빈값구하기 {
    // TODO 문제는 풀었는데 반복문이 너무 많은거 같은데,, 다른 자료구조로 풀어봐야 하나 ?


    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 3, 3, 4};
        int[] test2 = {1, 1, 2, 2};
        int[] test3 = {1};
        int[] test4 = {0, 0, 0};
        int[] test5 = {1, 1, 123};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);

        int solution4 = solution(test4);
        System.out.println("solution4 = " + solution4);

        int solution5 = solution(test5);
        System.out.println("solution5 = " + solution5);
    }

    public static int solution(int[] array) {
        // 각 배열에 카운팅한 값을 할당
        int[] result = new int[1000];
        for (int i = 0; i < array.length; i++) {
            result[array[i]]++;
        }

        // 최빈값을 확인
        int max = 0;
        int maxIndex = 0;
        boolean multiple = false;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                maxIndex = i;
                multiple = false;
            } else if (result[i] == max) {
                multiple = true;
            }
        }

        return multiple ? -1 : maxIndex;
    }

    public static int solution1(int[] array) {
        // 각 배열에 카운팅한 값을 할당
        int[] result = new int[1000];
        for (int i = 0; i < array.length; i++) {
            result[array[i]]++;
        }

        // 최빈값을 확인
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                maxIndex = i;
            }
        }

        // 최빈값의 갯수를 확인
        int count = 0;
        for (int value : result) {
            if (value == max) {
                count++;
            }
        }

        // max 값이 여러개인경우 -1 return
        if (count >= 2) {
            return -1;
        } else { //  아닌 경우 max 값 return
            return maxIndex;
        }
    }
}
