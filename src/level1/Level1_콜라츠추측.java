package level1;

public class Level1_콜라츠추측 {
    public static void main(String[] args) {
        int solution1 = solution(6);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(16);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(626331);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int num) {
        int answer = 0;
        if (num == 1) {
            return 1;
        }

        while (true) {
            if (num == 1) {
                break;
            } else if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }

        return answer;
    }
}
