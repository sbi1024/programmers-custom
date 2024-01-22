package _java.level0;

public class Level0_조건문자열 {
    public static void main(String[] args) {
        int solution1 = solution("<", "=", 20, 50);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(">", "!", 41, 78);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                if (n <= m) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (n < m) {
                    return 1;
                } else {
                    return 0;
                }
            }
        } else {
            if (eq.equals("=")) {
                if (n >= m) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                if (n > m) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
}
