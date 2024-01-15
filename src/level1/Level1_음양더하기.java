package level1;

public class Level1_음양더하기 {
    public static void main(String[] args) {
        int[] test1 = {4, 7, 12};
        boolean[] test2 = {true, false, true};

        int[] test3 = {1, 2, 3};
        boolean[] test4 = {false, false, true};

        int solution1 = solution(test1, test2); // 9
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test3, test4); // 0
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i] == false) {
                answer += absolutes[i] * -1;
            } else {
                answer += absolutes[i];
            }
        }
        return answer;
    }
}
