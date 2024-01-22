package java.level0;

public class Level0_겹치는선분의길이 {
    public static void main(String[] args) {
        int[][] test1 = {{0, 1}, {2, 5}, {3, 9}};
        int[][] test2 = {{-1, 1}, {1, 3}, {3, 9}};
        int[][] test3 = {{0, 5}, {3, 9}, {1, 10}};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        int[] tempArray = new int[200];

        for (int[] line : lines) {
            for (int j = (line[0] + 100); j < (line[1] + 100); j++) {
                tempArray[j]++;
            }
        }

        for (int temp : tempArray) {
            if (temp > 1) {
                answer++;
            }
        }

        return answer;
    }
}
