package java.level1;

public class Level1_덧칠하기 {
    public static void main(String[] args) {
        int[] test1 = {2, 3, 6};
        int[] test2 = {1, 3};
        int[] test3 = {1, 2, 3, 4};
        int[] test4 = {1, 7};

        int solution1 = solution(8, 4, test1);
        System.out.println("solution1 = " + solution1); // 2

        int solution2 = solution(5, 4, test2);
        System.out.println("solution2 = " + solution2); // 1

        int solution3 = solution(4, 1, test3);
        System.out.println("solution3 = " + solution3); // 4

        int solution4 = solution(9, 1, test4);
        System.out.println("solution4 = " + solution4); // 4

    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int[] array = new int[n];
        for (int index : section) array[index - 1] = -1;
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == -1) {
                for (int j = i; j < i + m; j++) {
                    array[j] = 0;
                    if (j == arrayLength - 1) {
                        break;
                    }
                }
                answer++;
            }
        }
        return answer;
    }
}
