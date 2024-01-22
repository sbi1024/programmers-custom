package java.level0;

public class Level0_피자나눠먹기3 {
    public static void main(String[] args) {
        int solution1 = solution(7, 10);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(4, 12);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int slice, int n) {
        int answer = 1;
        while (true) {
            if ((slice * answer) >= n) {
                return answer;
            } else {
                answer++;
            }
        }
    }
}
