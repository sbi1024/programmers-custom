package _java.level1;

public class Level1_푸드파이트대회 {
    public static void main(String[] args) {
        int[] test1 = {1, 3, 4, 6};
        String solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int[] test2 = {1, 7, 1, 2};
        String solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int foodCount = food[i] / 2;
            for (int j = 0; j < foodCount; j++) {
                sb.append(i);
            }
        }
        String firstStr = sb.toString();
        String middleStr = "0";
        String lastStr = sb.reverse().toString();
        return firstStr + middleStr + lastStr;
    }
}
