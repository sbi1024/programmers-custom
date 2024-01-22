package _java.level1;

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
        if (num == 1) {
            return num;
        }

        int answer = 0;
        long lNum = num;
        while (lNum != 1) {
            if (answer == 500) {
                return -1;
            } else if (lNum % 2 == 0) {
                lNum /= 2;
            } else {
                lNum = lNum * 3 + 1;
            }
            answer++;
        }
        return answer;
    }
}
