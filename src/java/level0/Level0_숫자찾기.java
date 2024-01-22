package java.level0;

public class Level0_숫자찾기 {
    public static void main(String[] args) {
        int solution1 = solution(29183, 1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(232443, 4);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(123456, 7);
        System.out.println("solution3 = " + solution3);

    }

    public static int solution(int num, int k) {
        int answer = String.valueOf(num).indexOf(String.valueOf(k));
        return answer != -1 ? answer + 1 : -1;
    }
}
