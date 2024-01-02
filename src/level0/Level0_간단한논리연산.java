package level0;

public class Level0_간단한논리연산 {
    public static void main(String[] args) {
        boolean solution1 = solution(false, true, true, true);
        System.out.println("solution1 = " + solution1);

        boolean solution2 = solution(true, false, false, false);
        System.out.println("solution2 = " + solution2);
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        if ((x1 || x2) && (x3 || x4)) {
            answer = true;
        }
        return answer;
    }
}
