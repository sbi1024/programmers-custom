package level0;

import java.util.Arrays;

public class Level0_커피심부름 {
    public static void main(String[] args) {
        String[] test1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] test2 = {"americanoice", "americano", "iceamericano"};

        int solution1 = solution(test1);
        System.out.println("solution1 = " + solution1);

        int solution2 = solution(test2);
        System.out.println("solution2 = " + solution2);
    }

    public static int solution(String[] order) {
        int answer = 0;
        for (String ord : order) {
            if (ord.contains("americano") || ord.contains("anything")) {
                answer += 4500;
            } else if (ord.contains("cafelatte")) {
                answer += 5000;
            }
        }
        return answer;
    }
}
