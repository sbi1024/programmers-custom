package level1;

public class Level1_내적 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {-3, -1, 0, 2};
        int solution1 = solution(test1, test2); // 3
        System.out.println("solution1 = " + solution1);

        int[] test3 = {-1, 0, 1};
        int[] test4 = {1, 0, -1};
        int solution2 = solution(test3, test4); // -2
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }
        return answer;
    }
}
