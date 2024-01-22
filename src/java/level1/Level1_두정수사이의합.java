package java.level1;

import java.util.stream.LongStream;

public class Level1_두정수사이의합 {
    public static void main(String[] args) {
        long solution1 = solution(3, 5);
        System.out.println("solution1 = " + solution1); // 12

        long solution2 = solution(3, 3);
        System.out.println("solution2 = " + solution2); // 3

        long solution3 = solution(5, 3);
        System.out.println("solution3 = " + solution3); // 12

        long solution4 = solution(10000000 , 1);
        System.out.println("solution4 = " + solution4); //
    }

    public static long solution(int a, int b) {
        return a < b ? LongStream.rangeClosed(a, b).sum() : LongStream.rangeClosed(b, a).sum();
    }
}
