package java.level0;

public class Level0_점의위치구하기 {
    public static void main(String[] args) {
        int[] test1 = {2, 4};
        int[] test2 = {-7, 9};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] dot) {
        int firstValue = Integer.signum(dot[0]);
        int secondValue = Integer.signum(dot[1]);

        if (firstValue == 1 && secondValue == 1) {
            return 1;
        } else if (firstValue == -1 && secondValue == 1) {
            return 2;
        } else if (firstValue == -1 && secondValue == -1) {
            return 3;
        } else {
            return 4;
        }
    }
}
