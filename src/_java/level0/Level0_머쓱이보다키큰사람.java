package _java.level0;

public class Level0_머쓱이보다키큰사람 {
    public static void main(String[] args) {
        int[] test1 = {149, 180, 192, 170};
        int[] test2 = {180, 120, 140};

        int solution1 = solution(test1,167);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, 190);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] array, int height) {
        int answer = 0;
         for (int i : array) {
            if (i > height) {
                answer += 1;
            }
        }
        return answer;
    }
}
