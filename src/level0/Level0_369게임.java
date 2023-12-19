package level0;

public class Level0_369게임 {
    public static void main(String[] args) {
        int solution1 = solution(3);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(29423);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int order) {
        int answer = 0;
        String[] orderStrSplitArray = String.valueOf(order).split("");
        for (String orderStr : orderStrSplitArray) {
            if (orderStr.equals("3") || orderStr.equals("6") || orderStr.equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}
