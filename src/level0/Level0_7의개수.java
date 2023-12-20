package level0;

public class Level0_7의개수 {
    public static void main(String[] args) {
        int[] test1 = {7, 77, 17};
        int[] test2 = {10, 29};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(int[] array) {
        int answer = 0;
        for (int arr : array) {
            String arrStr = String.valueOf(arr);
            if (arrStr.contains("7")) {
                answer += arrStr.length() - arrStr.replace("7", "").length();
            }
        }
        return answer;
    }
}
