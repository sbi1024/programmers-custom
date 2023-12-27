package level0;

public class Level0_정수부분 {
    public static void main(String[] args) {
        int solution1 = solution(1.42);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(69.32);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(double flo) {
        return (int) flo;
    }
}
