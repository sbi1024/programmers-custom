package java.level1;

public class Level1_콜라문제 {
    public static void main(String[] args) {
        int solution1 = solution(2, 1, 20);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(3, 1, 20);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;

        // a = 2개를 가져다주면
        // b = 1개를 준다
        // n = 만약 20개를 가져가면 처음에는 10개 , 5개 , 2개 , 1개 , 1개

        while (n >= a) {
            int mod = n / a;
            int remain = n % a;
            int bonus = mod * b;
            n = bonus + remain;
            answer += bonus;
        }

        return answer;
    }
}
