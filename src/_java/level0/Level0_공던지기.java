package _java.level0;

public class Level0_공던지기 {
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 4, 5, 6};
        int[] test3 = {1, 2, 3};

        int solution1 = solution(test1, 2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2, 5);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3, 3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int numbersIndex = 0;
        int kIndex = 0;

        while (true) {
            if (numbers.length - 1 < numbersIndex) {
                numbersIndex = Math.abs((numbersIndex % (numbers.length - 1)) - 1);
            }
            answer = numbers[numbersIndex];
            numbersIndex += 2;
            kIndex += 1;
            if (k == kIndex) {
                break;
            }
        }

        return answer;
    }
}
