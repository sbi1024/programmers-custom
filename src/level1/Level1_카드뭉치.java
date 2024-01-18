package level1;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Level1_카드뭉치 {
    public static void main(String[] args) {
        String[] test1 = {"i", "drink", "water"};
        String[] test2 = {"want", "to"};
        String[] test3 = {"i", "want", "to", "drink", "water"};
        String solution1 = solution(test1, test2, test3);
        System.out.println("solution1 = " + solution1);

        String[] test4 = {"i", "water", "drink"};
        String[] test5 = {"want", "to"};
        String[] test6 = {"i", "want", "to", "drink", "water"};
        String solution2 = solution(test4, test5, test6);
        System.out.println("solution2 = " + solution2);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cardOneQueue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> cardTwoQueue = new LinkedList<>(Arrays.asList(cards2));

        for (String go : goal) {
            if (cardOneQueue.peek() != null && cardOneQueue.peek().equals(go)) {
                cardOneQueue.poll();
            } else if (cardTwoQueue.peek() != null && cardTwoQueue.peek().equals(go)) {
                cardTwoQueue.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}
