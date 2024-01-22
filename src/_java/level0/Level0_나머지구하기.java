package _java.level0;

public class Level0_나머지구하기 {
    public static void main(String[] args) {
        int solution1 = solution(3, 2);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(10, 5);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int num1, int num2) {
        int answer = -1;

        int remainNum = num1 % num2;
        answer = remainNum;

        return answer;
    }
}
