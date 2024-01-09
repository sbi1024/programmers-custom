package level0;

public class Level0_각도기 {
    public static void main(String[] args) {
        int solution1 = solution(70);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(91);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(180);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int angle) {
        int answer = 0;

        if (angle == 180) {
            answer = 4;
        } else if (angle > 90) {
            answer = 3;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 0) {
            answer = 1;
        }

        return answer;
    }
}
