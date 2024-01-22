package java.level1;

public class Level1_옹알이2 {
    // TODO 문제를 대충 읽지말자, 연속된 단어가 언급이 안된다는거지, 중간에 단어가 껴있으면 그건 가능하다.
    // 문제를 제대로 안읽어서 계속 틀린거였음
    public static void main(String[] args) {
        String[] test1 = {"aya", "yee", "u", "maa"};
        String[] test2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        String[] test3 = {"ayaayaa", "ye"};
        String[] test4 = {"yeayaye"};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);

        int solution3 = solution(test3);
        System.out.println("solution3 = " + solution3);

        int solution4 = solution(test4);
        System.out.println("solution4 = " + solution4);

    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String repeatWord1 = "ayaaya";
        String repeatWord2 = "yeye";
        String repeatWord3 = "woowoo";
        String repeatWord4 = "mama";

        for (int i = 0; i < babbling.length; i++) {
            String babble = babbling[i];
            if (!(babble.contains(repeatWord1) ||
                    babble.contains(repeatWord2) ||
                    babble.contains(repeatWord3) ||
                    babble.contains(repeatWord4))) {
                babble = babble.replace("aya", " ");
                babble = babble.replace("ye", " ");
                babble = babble.replace("woo", " ");
                babble = babble.replace("ma", " ");
                babble = babble.replace(" ", "");
                if (babble.isEmpty()) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
