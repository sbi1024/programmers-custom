package level0;

public class Level0_삼각형의완성조건1 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3};
        int[] test2 = {3, 6, 2};
        int[] test3 = {199, 72, 222};

        int solution1 = solution(test1); // 2
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2); // 2
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3); // 1
        System.out.println("solution3 = " + solution3);


    }

    public static int solution(int[] sides) {
        int maxValue = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > maxValue) {
                maxValue = sides[i];
                maxIndex = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < sides.length; i++) {
            if (!(i == maxIndex)) {
                sum += sides[i];
            }
        }

        if (maxValue < sum) {
            return 1;
        } else {
            return 2;
        }
    }
}
