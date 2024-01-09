package level0;

import java.util.stream.IntStream;

public class Level0_순서쌍의개수 {
    public static void main(String[] args) {
        int solution1 = solution(20);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(100);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(value -> (n % value == 0)).count();
    }
}
