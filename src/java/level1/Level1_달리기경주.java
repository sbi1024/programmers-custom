package java.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Level1_달리기경주 {
    // TODO 프로그래머스에서 난 다른사람 풀이보지않고 풀었음에도 다른사람거 보고 풀은문제라고 해버리네.. ;
    public static void main(String[] args) {
        String[] test1 = {"mumu", "soe", "poe", "kai", "mine"};
        String[] test2 = {"kai", "kai", "mine", "mine"};
        String[] solution1 = solution(test1, test2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1)); // ["mumu", "kai", "mine", "soe", "poe"]
    }

    public static String[] solution(String[] players, String[] callings) {
        Map<Integer, String> rankMap = new HashMap<>();
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            rankMap.put(i + 1, players[i]);
            playerMap.put(players[i], i + 1);
        }

        for (String callingPlayerName : callings) {
            Integer callingPlayerRank = playerMap.get(callingPlayerName);
            String previousPlayerName = rankMap.get(callingPlayerRank - 1);
            Integer previousPlayerRank = playerMap.get(previousPlayerName);

            rankMap.put(previousPlayerRank, callingPlayerName);
            rankMap.put(callingPlayerRank, previousPlayerName);
            playerMap.put(previousPlayerName, callingPlayerRank);
            playerMap.put(callingPlayerName, previousPlayerRank);
        }

        String[] answer = new String[rankMap.size()];
        for (int i = 1; i <= answer.length; i++) {
            answer[i - 1] = rankMap.get(i);
        }

        return answer;
    }
}
