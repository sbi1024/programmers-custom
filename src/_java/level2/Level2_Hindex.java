package _java.level2;

public class Level2_Hindex {
    public static void main(String[] args) {
        int[] test1 = {3, 0, 6, 1, 5};
        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);
    }

    public static int solution(int[] citations) {
        int answer = 0;

        int useCount = 0;
        int notUseCount = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            for (int j = 0; j < citations.length; j++) {
                if (citations[j] >= i + 1) useCount++;
                if (citations[j] <= i + 1) notUseCount++;
            }
            if ((useCount >= i + 1) && (notUseCount <= i + 1)) {
                answer = i + 1;
                break;
            }
            useCount = 0;
            notUseCount = 0;
        }

        return answer;
    }
}
