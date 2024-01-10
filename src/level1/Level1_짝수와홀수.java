package level1;

public class Level1_짝수와홀수 {
    public static void main(String[] args) {
        // 3	"Odd"
        // 4	"Even"
        String solution1 = solution(3);
        System.out.println("solution1 = " + solution1);

        String solution2 = solution(4);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
