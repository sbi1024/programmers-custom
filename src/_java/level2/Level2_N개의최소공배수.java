package _java.level2;

public class Level2_N개의최소공배수 {
    public static void main(String[] args) {
        int[] test1 = {2, 6, 8, 14};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // 168

        int[] test2 = {1, 2, 3};
        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2); // 6

        int[] test3 = {20, 50, 60};
        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3); // 6
    }

    public static int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) answer = lcm(answer, arr[i]);
        return answer;
    }

    public static int gcm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcm(b, a % b);
    }

    public static int lcm(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        return max * min / gcm(max, min);
    }

}
