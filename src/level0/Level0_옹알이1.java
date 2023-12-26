package level0;

public class Level0_옹알이1 {
    public static void main(String[] args) {
        String[] test1 = {"aya", "yee", "u", "maa", "wyeoo"}; // 1
        String[] test2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}; // 3

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] babblingKeyWord = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String babblingStr = babbling[i];
            for (int j = 0; j < babblingKeyWord.length; j++) {
                babblingStr = babblingStr.replace(babblingKeyWord[j], " ");
                if (babblingStr.trim().isEmpty()) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
