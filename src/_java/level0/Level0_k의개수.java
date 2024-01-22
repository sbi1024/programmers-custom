package _java.level0;

public class Level0_k의개수 {
    public static void main(String[] args) {
        int solution1 = solution(1, 13, 1);
        System.out.println("solution1 = " + solution1); // 6

        int solution2 = solution(10, 50, 5);
        System.out.println("solution2 = " + solution2); // 5

        int solution3 = solution(3, 10, 2);
        System.out.println("solution3 = " + solution3); // 0
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        for (int a = i; a <= j; a++) {
            String[] split = String.valueOf(a).split("");
            for (String s : split) {
                if (s.equals(String.valueOf(k))) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
