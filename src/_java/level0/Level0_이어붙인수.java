package _java.level0;

public class Level0_이어붙인수 {
    public static void main(String[] args) {
        int[] test1 = {3, 4, 5, 2, 1};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1); // 393

        int[] test2 = {5, 7, 8, 3};
        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2); // 581
    }

    public static int solution(int[] num_list) {
        StringBuffer holSb = new StringBuffer();
        StringBuffer jakSb = new StringBuffer();
        for (int num : num_list) {
            if (num % 2 != 0) {
                holSb.append(num);
            } else {
                jakSb.append(num);
            }
        }
        return Integer.parseInt(holSb.toString()) + Integer.parseInt(jakSb.toString());
    }
}
