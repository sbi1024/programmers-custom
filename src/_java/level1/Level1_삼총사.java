package _java.level1;

public class Level1_삼총사 {
    public static void main(String[] args) {
        int[] test1 = {-2, 3, 0, 2, -5};
        int[] test2 = {-3, -2, -1, 0, 1, 2, 3};
        int[] test3 = {-1, 1, -1, 1};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);

    }

    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int e = j + 1; e < number.length; e++) {
                    int sum = number[i] + number[j] + number[e];
                    if (sum == 0) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
