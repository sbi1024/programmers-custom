package level1;

public class Level1_정수제곱근판별 {
    public static void main(String[] args) {
        // TODO 풀었지만, 각 데이터 범위에 대한 인지가 부족하다고 느낌 (int long..)
        long solution1 = solution(121);
        System.out.println("solution1 = " + solution1);

        long solution2 = solution(3);
        System.out.println("solution2 = " + solution2);

        long solution3 = solution(400000000);
        System.out.println("solution3 = " + solution3);
    }

    public static long solution(long n) {
        for (long i = 1; i <= Math.sqrt(n); i++) {
            if (Math.pow(i, 2) == n) {
                return (long) Math.pow(i + 1, 2);
            }
        }
        return -1;
    }
}
