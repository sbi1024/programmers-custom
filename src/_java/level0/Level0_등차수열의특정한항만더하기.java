package _java.level0;

public class Level0_등차수열의특정한항만더하기 {
    public static void main(String[] args) {
        boolean[] test1 = {true, false, false, true, true};
        int solution1 = solution(3, 4, test1);
        System.out.println("solution1 = " + solution1);

        boolean[] test2 = {false, false, false, true, false, false, false};
        int solution2 = solution(7, 1, test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            int key = a + d * i;
            boolean value = included[i];
            if (value == true) {
                answer += key;
            }
        }
        return answer;
    }
}
